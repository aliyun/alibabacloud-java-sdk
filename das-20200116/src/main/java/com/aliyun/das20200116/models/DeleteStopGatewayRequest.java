// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class DeleteStopGatewayRequest extends TeaModel {
    /**
     * <p>The ID that can uniquely identify the DBGateway. You can obtain the DBGateway ID by calling the <a href="https://help.aliyun.com/document_detail/230669.html">DescribeCloudbenchTask</a> operation. The DBGateway ID is the value of the <strong>ClientGatewayId</strong> field in the response.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>22938c83fcfbced4b4869b9695e3****</p>
     */
    @NameInMap("GatewayId")
    public String gatewayId;

    public static DeleteStopGatewayRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteStopGatewayRequest self = new DeleteStopGatewayRequest();
        return TeaModel.build(map, self);
    }

    public DeleteStopGatewayRequest setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }
    public String getGatewayId() {
        return this.gatewayId;
    }

}
