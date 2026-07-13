// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeCustomLineRequest extends TeaModel {
    /**
     * <p>The language of the request and response. Default value: <strong>zh</strong>. Valid values:</p>
     * <ul>
     * <li><p><strong>zh</strong>: Chinese</p>
     * </li>
     * <li><p><strong>en</strong>: English</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The unique ID of the custom line.&lt;props=&quot;china&quot;&gt; Call <a href="https://help.aliyun.com/en/dns/api-alidns-2015-01-09-describecustomlines?spm=a2c4g.11186623.help-menu-search-29697.d_0">DescribeCustomLines</a> to obtain this ID.
     * &lt;props=&quot;intl&quot;&gt;Call <a href="https://www.alibabacloud.com/help/en/dns/api-alidns-2015-01-09-describecustomlines?spm=a2c63.p38356.help-menu-search-29697.d_0">DescribeCustomLines</a> to obtain this ID.</p>
     * 
     * <strong>example:</strong>
     * <p>5*****</p>
     */
    @NameInMap("LineId")
    public Long lineId;

    public static DescribeCustomLineRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCustomLineRequest self = new DescribeCustomLineRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCustomLineRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeCustomLineRequest setLineId(Long lineId) {
        this.lineId = lineId;
        return this;
    }
    public Long getLineId() {
        return this.lineId;
    }

}
