// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alinlp20200629.models;

import com.aliyun.tea.*;

public class GetTsChEcomRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("OriginQ")
    public String originQ;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("OriginT")
    public String originT;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ServiceCode")
    public String serviceCode;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Type")
    public String type;

    public static GetTsChEcomRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTsChEcomRequest self = new GetTsChEcomRequest();
        return TeaModel.build(map, self);
    }

    public GetTsChEcomRequest setOriginQ(String originQ) {
        this.originQ = originQ;
        return this;
    }
    public String getOriginQ() {
        return this.originQ;
    }

    public GetTsChEcomRequest setOriginT(String originT) {
        this.originT = originT;
        return this;
    }
    public String getOriginT() {
        return this.originT;
    }

    public GetTsChEcomRequest setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
        return this;
    }
    public String getServiceCode() {
        return this.serviceCode;
    }

    public GetTsChEcomRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
