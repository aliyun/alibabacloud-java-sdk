// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class UpdateRecordShrinkRequest extends TeaModel {
    /**
     * <p>The origin authentication settings for the CNAME record.</p>
     */
    @NameInMap("AuthConf")
    public String authConfShrink;

    /**
     * <p>The use case for proxy acceleration. Omit this parameter if proxy acceleration is disabled. Valid values:</p>
     * <ul>
     * <li><p><strong>video_image</strong>: Video and images.</p>
     * </li>
     * <li><p><strong>api</strong>: APIs.</p>
     * </li>
     * <li><p><strong>web</strong>: Web pages.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>web</p>
     */
    @NameInMap("BizName")
    public String bizName;

    /**
     * <p>A comment for the record.</p>
     * 
     * <strong>example:</strong>
     * <p>This is a remark.</p>
     */
    @NameInMap("Comment")
    public String comment;

    /**
     * <p>The DNS data for the record. The required content varies based on the record type. For more information, see &lt;props=&quot;china&quot;&gt;<a href="https://help.aliyun.com/document_detail/2708761.html">Documentation</a>&lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/help/doc-detail/2708761.html">Documentation</a>.</p>
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
     * <p>The origin HOST policy. This policy, which applies only to CNAME records, determines the value of the <code>HOST</code> header in requests sent to the origin. Valid values:</p>
     * <ul>
     * <li><p><strong>follow_hostname</strong>: Follows the host record.</p>
     * </li>
     * <li><p><strong>follow_origin_domain</strong>: Follows the origin domain name.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>follow_origin_domain</p>
     */
    @NameInMap("HostPolicy")
    public String hostPolicy;

    @NameInMap("HttpPorts")
    public String httpPorts;

    @NameInMap("HttpsPorts")
    public String httpsPorts;

    /**
     * <p>Indicates whether to enable proxy acceleration for the record. Only CNAME and A/AAAA records support proxy acceleration. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: Enables proxy acceleration.</p>
     * </li>
     * <li><p><strong>false</strong>: Disables proxy acceleration.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Proxied")
    public Boolean proxied;

    /**
     * <p>The record ID. Call the <a href="https://help.aliyun.com/document_detail/2850265.html">ListRecords</a> operation to get this ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1234567890123</p>
     */
    @NameInMap("RecordId")
    public Long recordId;

    /**
     * <p>The origin type for the CNAME record. This parameter is required for CNAME records. Valid values:</p>
     * <ul>
     * <li><p><strong>OSS</strong>: An OSS origin.</p>
     * </li>
     * <li><p><strong>S3</strong>: An S3 origin.</p>
     * </li>
     * <li><p><strong>LB</strong>: A load balancer origin.</p>
     * </li>
     * <li><p><strong>OP</strong>: An origin address pool origin.</p>
     * </li>
     * <li><p><strong>Domain</strong>: A standard domain name origin.</p>
     * </li>
     * </ul>
     * <p>If this parameter is omitted or left empty, the default value is <code>Domain</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>OSS</p>
     */
    @NameInMap("SourceType")
    public String sourceType;

    /**
     * <p>The record\&quot;s time to live (TTL) in seconds. The value must be an integer from <strong>30 to 86400</strong> or 1. A value of 1 sets the TTL to automatic.</p>
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

    public UpdateRecordShrinkRequest setHttpPorts(String httpPorts) {
        this.httpPorts = httpPorts;
        return this;
    }
    public String getHttpPorts() {
        return this.httpPorts;
    }

    public UpdateRecordShrinkRequest setHttpsPorts(String httpsPorts) {
        this.httpsPorts = httpsPorts;
        return this;
    }
    public String getHttpsPorts() {
        return this.httpsPorts;
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
