// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeUserAlarmConfigRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <strong>example:</strong>
     * <p>59.82.135.XXX</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    public static DescribeUserAlarmConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserAlarmConfigRequest self = new DescribeUserAlarmConfigRequest();
        return TeaModel.build(map, self);
    }

    public DescribeUserAlarmConfigRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeUserAlarmConfigRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

}
