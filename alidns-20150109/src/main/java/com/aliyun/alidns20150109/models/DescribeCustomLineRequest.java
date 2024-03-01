// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeCustomLineRequest extends TeaModel {
    /**
     * <p>The language.</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The unique ID of the custom line.</p>
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
