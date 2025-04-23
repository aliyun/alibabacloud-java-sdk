// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeCustomLineRequest extends TeaModel {
    /**
     * <p>The language of the content within the request and response. Default value: <strong>zh</strong>. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong>: Chinese</li>
     * <li><strong>en</strong>: English</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The unique ID of the custom line. You can call <a href="https://www.alibabacloud.com/help/en/dns/api-alidns-2015-01-09-describecustomlines?spm=a2c63.p38356.help-menu-search-29697.d_0">DescribeCustomLines</a> operation to obtain the ID</p>
     * 
     * <strong>example:</strong>
     * <p>597</p>
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
