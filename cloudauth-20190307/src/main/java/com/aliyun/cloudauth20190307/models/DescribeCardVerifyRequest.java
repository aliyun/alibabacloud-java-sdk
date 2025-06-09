// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class DescribeCardVerifyRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>91707dc296d469ad38e4c5efa6a0xxxx</p>
     */
    @NameInMap("CertifyId")
    public String certifyId;

    public static DescribeCardVerifyRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCardVerifyRequest self = new DescribeCardVerifyRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCardVerifyRequest setCertifyId(String certifyId) {
        this.certifyId = certifyId;
        return this;
    }
    public String getCertifyId() {
        return this.certifyId;
    }

}
