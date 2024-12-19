// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class QueryAddressRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>LMALL202106040001</p>
     */
    @NameInMap("BizId")
    public String bizId;

    /**
     * <strong>example:</strong>
     * <p>510132</p>
     */
    @NameInMap("DivisionCode")
    public String divisionCode;

    /**
     * <strong>example:</strong>
     * <p>113.77.105.73</p>
     */
    @NameInMap("Ip")
    public String ip;

    public static QueryAddressRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAddressRequest self = new QueryAddressRequest();
        return TeaModel.build(map, self);
    }

    public QueryAddressRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public QueryAddressRequest setDivisionCode(String divisionCode) {
        this.divisionCode = divisionCode;
        return this;
    }
    public String getDivisionCode() {
        return this.divisionCode;
    }

    public QueryAddressRequest setIp(String ip) {
        this.ip = ip;
        return this;
    }
    public String getIp() {
        return this.ip;
    }

}
