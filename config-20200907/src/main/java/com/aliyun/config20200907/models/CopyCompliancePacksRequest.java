// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class CopyCompliancePacksRequest extends TeaModel {
    /**
     * <p>The IDs of the destination account groups into which the compliance packages are replicated. Separate multiple account group IDs with commas (,).</p>
     * <br>
     * <p>> If this parameter is left empty, the compliance packages are replicated to the current account group.</p>
     */
    @NameInMap("DesAggregatorIds")
    public String desAggregatorIds;

    /**
     * <p>The ID of the account group to which the compliance packages belong.</p>
     * <br>
     * <p>For more information about how to obtain the ID of an account group, see [ListAggregators](https://help.aliyun.com/document_detail/255797.html).</p>
     */
    @NameInMap("SrcAggregatorId")
    public String srcAggregatorId;

    /**
     * <p>The IDs of the compliance packages. Separate multiple compliance package IDs with commas (,).</p>
     * <br>
     * <p>For more information about how to obtain the ID of a compliance package, see [ListCompliancePacks](https://help.aliyun.com/document_detail/263332.html).</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("SrcCompliancePackIds")
    public String srcCompliancePackIds;

    public static CopyCompliancePacksRequest build(java.util.Map<String, ?> map) throws Exception {
        CopyCompliancePacksRequest self = new CopyCompliancePacksRequest();
        return TeaModel.build(map, self);
    }

    public CopyCompliancePacksRequest setDesAggregatorIds(String desAggregatorIds) {
        this.desAggregatorIds = desAggregatorIds;
        return this;
    }
    public String getDesAggregatorIds() {
        return this.desAggregatorIds;
    }

    public CopyCompliancePacksRequest setSrcAggregatorId(String srcAggregatorId) {
        this.srcAggregatorId = srcAggregatorId;
        return this;
    }
    public String getSrcAggregatorId() {
        return this.srcAggregatorId;
    }

    public CopyCompliancePacksRequest setSrcCompliancePackIds(String srcCompliancePackIds) {
        this.srcCompliancePackIds = srcCompliancePackIds;
        return this;
    }
    public String getSrcCompliancePackIds() {
        return this.srcCompliancePackIds;
    }

}
