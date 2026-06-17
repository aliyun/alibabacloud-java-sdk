// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeUserAlarmConfigRequest extends TeaModel {
    /**
     * <p>The language of the response. Valid values: zh and en. Default value: zh.</p>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The source IP address of the request.</p>
     * 
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
