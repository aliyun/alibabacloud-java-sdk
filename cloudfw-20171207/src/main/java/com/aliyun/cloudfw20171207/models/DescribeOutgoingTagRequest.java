// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeOutgoingTagRequest extends TeaModel {
    /**
     * <p>The type of the destination. Valid values:</p>
     * <ul>
     * <li><p><strong>Domain</strong>: domain name.</p>
     * </li>
     * <li><p><strong>DstIP</strong>: IP address.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Domain</p>
     */
    @NameInMap("DstType")
    public String dstType;

    /**
     * <p>The end of the time range to query. This value is a UNIX timestamp. Unit: seconds.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1749003483</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The language of the content. Valid values:</p>
     * <ul>
     * <li><p><strong>zh</strong> (default): Chinese.</p>
     * </li>
     * <li><p><strong>en</strong>: English.</p>
     * </li>
     * </ul>
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
     * <p>60.179.226.XXX</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    /**
     * <p>The beginning of the time range to query. This value is a UNIX timestamp. Unit: seconds.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1743646544</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The ID of the tag.</p>
     * 
     * <strong>example:</strong>
     * <p>103208</p>
     */
    @NameInMap("TagId")
    public String tagId;

    public static DescribeOutgoingTagRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeOutgoingTagRequest self = new DescribeOutgoingTagRequest();
        return TeaModel.build(map, self);
    }

    public DescribeOutgoingTagRequest setDstType(String dstType) {
        this.dstType = dstType;
        return this;
    }
    public String getDstType() {
        return this.dstType;
    }

    public DescribeOutgoingTagRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeOutgoingTagRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeOutgoingTagRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public DescribeOutgoingTagRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeOutgoingTagRequest setTagId(String tagId) {
        this.tagId = tagId;
        return this;
    }
    public String getTagId() {
        return this.tagId;
    }

}
