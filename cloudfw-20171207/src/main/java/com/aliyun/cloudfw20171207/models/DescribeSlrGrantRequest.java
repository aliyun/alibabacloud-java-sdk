// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeSlrGrantRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <strong>example:</strong>
     * <p>113.225.22.XXX</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    public static DescribeSlrGrantRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSlrGrantRequest self = new DescribeSlrGrantRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSlrGrantRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeSlrGrantRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

}
