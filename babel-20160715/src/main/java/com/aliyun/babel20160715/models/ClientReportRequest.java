// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.babel20160715.models;

import com.aliyun.tea.*;

public class ClientReportRequest extends TeaModel {
    @NameInMap("CallerType")
    public String callerType;

    @NameInMap("ClientInformation")
    public String clientInformation;

    @NameInMap("ProductCode")
    public String productCode;

    public static ClientReportRequest build(java.util.Map<String, ?> map) throws Exception {
        ClientReportRequest self = new ClientReportRequest();
        return TeaModel.build(map, self);
    }

    public ClientReportRequest setCallerType(String callerType) {
        this.callerType = callerType;
        return this;
    }
    public String getCallerType() {
        return this.callerType;
    }

    public ClientReportRequest setClientInformation(String clientInformation) {
        this.clientInformation = clientInformation;
        return this;
    }
    public String getClientInformation() {
        return this.clientInformation;
    }

    public ClientReportRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

}
