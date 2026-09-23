// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class ListApplicationProvisionInfosRequest extends TeaModel {
    /**
     * <p>The source type of the application. Valid values:</p>
     * <ul>
     * <li>inner: applications from the current account.</li>
     * <li>external: applications from other accounts.</li>
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
