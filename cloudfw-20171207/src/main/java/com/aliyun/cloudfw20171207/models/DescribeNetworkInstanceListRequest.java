// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeNetworkInstanceListRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>cen-x5jayxou71ad73****</p>
     */
    @NameInMap("CenId")
    public String cenId;

    /**
     * <strong>example:</strong>
     * <p>expressconnect</p>
     */
    @NameInMap("ConnectType")
    public String connectType;

    /**
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    public static DescribeNetworkInstanceListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeNetworkInstanceListRequest self = new DescribeNetworkInstanceListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeNetworkInstanceListRequest setCenId(String cenId) {
        this.cenId = cenId;
        return this;
    }
    public String getCenId() {
        return this.cenId;
    }

    public DescribeNetworkInstanceListRequest setConnectType(String connectType) {
        this.connectType = connectType;
        return this;
    }
    public String getConnectType() {
        return this.connectType;
    }

    public DescribeNetworkInstanceListRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

}
