// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dfs20180620.models;

import com.aliyun.tea.*;

public class ListFederationsRequest extends TeaModel {
    @NameInMap("FederationId")
    public String federationId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("InputRegionId")
    public String inputRegionId;

    public static ListFederationsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListFederationsRequest self = new ListFederationsRequest();
        return TeaModel.build(map, self);
    }

    public ListFederationsRequest setFederationId(String federationId) {
        this.federationId = federationId;
        return this;
    }
    public String getFederationId() {
        return this.federationId;
    }

    public ListFederationsRequest setInputRegionId(String inputRegionId) {
        this.inputRegionId = inputRegionId;
        return this;
    }
    public String getInputRegionId() {
        return this.inputRegionId;
    }

}
