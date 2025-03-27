// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class CreateRecordShrinkRequest extends TeaModel {
    /**
     * <p>The origin authentication information of the CNAME record.</p>
     */
    @NameInMap("AuthConf")
    public String authConfShrink;

    /**
     * <p>The business scenario of the record for acceleration. Leave the parameter empty if your record is not proxied. Valid values:</p>
     * <ul>
     * <li><strong>image_video</strong>: video and image.</li>
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
     * <p>The comment of the record. The maximum length is 100 characters.</p>
     * 
     * <strong>example:</strong>
     * <p>This is a remark.</p>
     */
    @NameInMap("Comment")
    public String comment;

    /**
     * <p>The DNS record information. The format of this field varies based on the record type. For more information, see <a href="https://www.alibabacloud.com/help/doc-detail/2708761.html">References</a> .</p>
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
     * <li>follow_hostname: Follow the host record.</li>
     * <li>follow_origin_domain: match the origin\&quot;s domain name.</li>
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
     * <p>The record name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://www.example.com">www.example.com</a></p>
     */
    @NameInMap("RecordName")
    public String recordName;

    /**
     * <p>The website ID, which can be obtained by calling the <a href="https://help.aliyun.com/document_detail/2850189.html">ListSites</a> operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1234567890123</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    /**
     * <p>The origin type for the CNAME record. This parameter is required when you add a CNAME record. Valid values:</p>
     * <ul>
     * <li><strong>OSS</strong>: OSS bucket.</li>
     * <li><strong>S3</strong>: S3 bucket.</li>
     * <li><strong>LB</strong>: load balancer.</li>
     * <li><strong>OP</strong>: origin pool.</li>
     * <li><strong>Domain</strong>: domain name.</li>
     * </ul>
     * <p>If you do not pass this parameter or if you leave its value empty, Domain is used by default.</p>
     * 
     * <strong>example:</strong>
     * <p>OSS</p>
     */
    @NameInMap("SourceType")
    public String sourceType;

    /**
     * <p>The TTL of the record. Unit: seconds. If the value is 1, the TTL of the record is determined by the system.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("Ttl")
    public Integer ttl;

    /**
     * <p>The type of the DNS record. For example, A/AAAA, TXT, MX, or CNAME.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>A/AAAA</p>
     */
    @NameInMap("Type")
    public String type;

    public static CreateRecordShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateRecordShrinkRequest self = new CreateRecordShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateRecordShrinkRequest setAuthConfShrink(String authConfShrink) {
        this.authConfShrink = authConfShrink;
        return this;
    }
    public String getAuthConfShrink() {
        return this.authConfShrink;
    }

    public CreateRecordShrinkRequest setBizName(String bizName) {
        this.bizName = bizName;
        return this;
    }
    public String getBizName() {
        return this.bizName;
    }

    public CreateRecordShrinkRequest setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

    public CreateRecordShrinkRequest setDataShrink(String dataShrink) {
        this.dataShrink = dataShrink;
        return this;
    }
    public String getDataShrink() {
        return this.dataShrink;
    }

    public CreateRecordShrinkRequest setHostPolicy(String hostPolicy) {
        this.hostPolicy = hostPolicy;
        return this;
    }
    public String getHostPolicy() {
        return this.hostPolicy;
    }

    public CreateRecordShrinkRequest setProxied(Boolean proxied) {
        this.proxied = proxied;
        return this;
    }
    public Boolean getProxied() {
        return this.proxied;
    }

    public CreateRecordShrinkRequest setRecordName(String recordName) {
        this.recordName = recordName;
        return this;
    }
    public String getRecordName() {
        return this.recordName;
    }

    public CreateRecordShrinkRequest setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

    public CreateRecordShrinkRequest setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

    public CreateRecordShrinkRequest setTtl(Integer ttl) {
        this.ttl = ttl;
        return this;
    }
    public Integer getTtl() {
        return this.ttl;
    }

    public CreateRecordShrinkRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
