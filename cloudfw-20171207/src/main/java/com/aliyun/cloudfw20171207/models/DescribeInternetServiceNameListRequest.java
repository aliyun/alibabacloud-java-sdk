// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeInternetServiceNameListRequest extends TeaModel {
    /**
     * <p>The language of the response.</p>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The source IP address of the visitor.</p>
     * 
     * <strong>example:</strong>
     * <p>140.240.17.XXX</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    public static DescribeInternetServiceNameListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeInternetServiceNameListRequest self = new DescribeInternetServiceNameListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeInternetServiceNameListRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeInternetServiceNameListRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

}
