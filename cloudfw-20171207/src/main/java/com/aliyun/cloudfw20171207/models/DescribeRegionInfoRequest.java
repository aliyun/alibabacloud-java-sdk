// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeRegionInfoRequest extends TeaModel {
    /**
     * <p>The language of the request and response. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong> (default): Chinese.</li>
     * <li><strong>en</strong>: English.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The tracing code.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>yundun</p>
     */
    @NameInMap("SourceCode")
    public String sourceCode;

    /**
     * <p>The source IP address of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>59.82.59.XX</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    public static DescribeRegionInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeRegionInfoRequest self = new DescribeRegionInfoRequest();
        return TeaModel.build(map, self);
    }

    public DescribeRegionInfoRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeRegionInfoRequest setSourceCode(String sourceCode) {
        this.sourceCode = sourceCode;
        return this;
    }
    public String getSourceCode() {
        return this.sourceCode;
    }

    public DescribeRegionInfoRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

}
