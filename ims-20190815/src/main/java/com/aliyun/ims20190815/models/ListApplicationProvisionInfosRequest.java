// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class ListApplicationProvisionInfosRequest extends TeaModel {
    /**
     * <p>The source of the applications. Valid values:</p>
     * <ul>
     * <li><p>inner: The applications are from the current account.</p>
     * </li>
     * <li><p>external: The applications are from other accounts.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>external</p>
     */
    @NameInMap("SourceType")
    public String sourceType;

    public static ListApplicationProvisionInfosRequest build(java.util.Map<String, ?> map) throws Exception {
        ListApplicationProvisionInfosRequest self = new ListApplicationProvisionInfosRequest();
        return TeaModel.build(map, self);
    }

    public ListApplicationProvisionInfosRequest setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

}
