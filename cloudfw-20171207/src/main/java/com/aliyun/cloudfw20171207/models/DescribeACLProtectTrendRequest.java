// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeACLProtectTrendRequest extends TeaModel {
    /**
     * <p>The end of the time range to query. The value is a UNIX timestamp that is accurate to seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1670397599</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The language of the content within the request and the response. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong> (default): Chinese</li>
     * <li><strong>en</strong>: English</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>This parameter is deprecated.</p>
     * 
     * <strong>example:</strong>
     * <p>223.95.87.130</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    /**
     * <p>The beginning of the time range to query. The value is a UNIX timestamp that is accurate to seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1677050306</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeACLProtectTrendRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeACLProtectTrendRequest self = new DescribeACLProtectTrendRequest();
        return TeaModel.build(map, self);
    }

    public DescribeACLProtectTrendRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeACLProtectTrendRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeACLProtectTrendRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public DescribeACLProtectTrendRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
