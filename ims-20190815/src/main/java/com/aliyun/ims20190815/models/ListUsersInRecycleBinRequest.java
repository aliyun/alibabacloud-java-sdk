// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class ListUsersInRecycleBinRequest extends TeaModel {
    /**
     * <p>The filter condition that is used to query information about a specified RAM user in the recycle bin.</p>
     * <p>You must specify this parameter in the <code>UserPrincipalName eq &lt;username&gt;@&lt;AccountAlias&gt;.onaliyun.com</code> format.</p>
     * 
     * <strong>example:</strong>
     * <p>UserPrincipalName eq <a href="mailto:test@example.onaliyun.com">test@example.onaliyun.com</a></p>
     */
    @NameInMap("Filter")
    public String filter;

    /**
     * <p>The <code>marker</code>. If part of a previous response is truncated, you can use this parameter to obtain the truncated part.</p>
     * 
     * <strong>example:</strong>
     * <p>EXAMPLE</p>
     */
    @NameInMap("Marker")
    public String marker;

    /**
     * <p>The number of entries to return. If a response is truncated because it reaches the value of <code>MaxItems</code>, the value of <code>IsTruncated</code> will be true.</p>
     * <p>Valid values: 1 to 100. Default value: 100.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("MaxItems")
    public Integer maxItems;

    public static ListUsersInRecycleBinRequest build(java.util.Map<String, ?> map) throws Exception {
        ListUsersInRecycleBinRequest self = new ListUsersInRecycleBinRequest();
        return TeaModel.build(map, self);
    }

    public ListUsersInRecycleBinRequest setFilter(String filter) {
        this.filter = filter;
        return this;
    }
    public String getFilter() {
        return this.filter;
    }

    public ListUsersInRecycleBinRequest setMarker(String marker) {
        this.marker = marker;
        return this;
    }
    public String getMarker() {
        return this.marker;
    }

    public ListUsersInRecycleBinRequest setMaxItems(Integer maxItems) {
        this.maxItems = maxItems;
        return this;
    }
    public Integer getMaxItems() {
        return this.maxItems;
    }

}
