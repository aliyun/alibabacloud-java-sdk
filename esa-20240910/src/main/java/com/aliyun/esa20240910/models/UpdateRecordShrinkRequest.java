// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class UpdateRecordShrinkRequest extends TeaModel {
    /**
     * <p>The origin authentication information of the CNAME record.</p>
     */
    @NameInMap("AuthConf")
    public String authConfShrink;

    /**
     * <p>The business scenario of the record for acceleration. Leave the parameter empty if your record is not proxied. Valid values:</p>
     * <ul>
     * <li><strong>video_image</strong>: video and image.</li>
     * <li><strong>api</strong>: API.</li>
     * <li><strong>web</strong>: web page.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>web</p>
     */
    @NameInMap("BizName")
    public String bizName;

    /**
     * <p>The comments of the record.</p>
     * 
     * <strong>example:</strong>
     * <p>This is a remark.</p>
     */
    @NameInMap("Comment")
    public String comment;

    /**
     * <p>The DNS record information. The format of this field varies based on the record type. For more information, see <a href="https://www.alibabacloud.com/help/doc-detail/2708761.html">Add DNS records</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *     &quot;value&quot;:&quot;2.2.2.2&quot;
     * }</p>
     */
    @NameInMap("Data")
    public String dataShrink;

    /**
     * <p>The origin host policy. This policy takes effect when the record type is CNAME. You can set the policy in two modes:</p>
     * <ul>
     * <li><strong>follow_hostname</strong>: match the requested domain name.</li>
     * <li><strong>follow_origin_domain</strong>: match the origin\&quot;s domain name.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>follow_origin_domain</p>
     */
    @NameInMap("HostPolicy")
    public String hostPolicy;

    /**
     * <p>Specifies whether to proxy the record. Only CNAME and A/AAAA records can be proxied. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Proxied")
    public Boolean proxied;

    /**
     * <p>The record ID, which can be obtained by calling <a href="https://help.aliyun.com/document_detail/2850265.html">ListRecords</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1234567890123</p>
     */
    @NameInMap("RecordId")
    public Long recordId;

    /**
     * <p>The type of the origin for the CNAME record. This parameter is required when you add a CNAME record. Valid values:</p>
     * <ul>
     * <li><strong>OSS</strong> : OSS origin.</li>
     * <li><strong>S3</strong> : S3 origin.</li>
     * <li><strong>LB</strong>: Load Balancer origin.</li>
     * <li><strong>OP</strong>: origin in an origin pool.</li>
     * <li><strong>Domain</strong>: common domain name.</li>
     * </ul>
     * <p>If you leave the parameter empty or set its value as null, the default is Domain, which is common domain name.</p>
     * 
     * <strong>example:</strong>
     * <p>OSS</p>
     */
    @NameInMap("SourceType")
    public String sourceType;

    /**
     * <p>The TTL of the record. Unit: seconds. The range is 30 to 86,400, or 1. If the value is 1, the TTL of the record is determined by the system.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("Ttl")
    public Integer ttl;

    @NameInMap("Type")
    public String type;

    public static UpdateRecordShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateRecordShrinkRequest self = new UpdateRecordShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateRecordShrinkRequest setAuthConfShrink(String authConfShrink) {
        this.authConfShrink = authConfShrink;
        return this;
    }
    public String getAuthConfShrink() {
        return this.authConfShrink;
    }

    public UpdateRecordShrinkRequest setBizName(String bizName) {
        this.bizName = bizName;
        return this;
    }
    public String getBizName() {
        return this.bizName;
    }

    public UpdateRecordShrinkRequest setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

    public UpdateRecordShrinkRequest setDataShrink(String dataShrink) {
        this.dataShrink = dataShrink;
        return this;
    }
    public String getDataShrink() {
        return this.dataShrink;
    }

    public UpdateRecordShrinkRequest setHostPolicy(String hostPolicy) {
        this.hostPolicy = hostPolicy;
        return this;
    }
    public String getHostPolicy() {
        return this.hostPolicy;
    }

    public UpdateRecordShrinkRequest setProxied(Boolean proxied) {
        this.proxied = proxied;
        return this;
    }
    public Boolean getProxied() {
        return this.proxied;
    }

    public UpdateRecordShrinkRequest setRecordId(Long recordId) {
        this.recordId = recordId;
        return this;
    }
    public Long getRecordId() {
        return this.recordId;
    }

    public UpdateRecordShrinkRequest setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

    public UpdateRecordShrinkRequest setTtl(Integer ttl) {
        this.ttl = ttl;
        return this;
    }
    public Integer getTtl() {
        return this.ttl;
    }

    public UpdateRecordShrinkRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
