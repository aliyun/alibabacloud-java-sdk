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
     * <p>The business scenario for record acceleration. This parameter is not required for records without acceleration enabled. Valid values:</p>
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
     * <p>The comment for the record.</p>
     * 
     * <strong>example:</strong>
     * <p>This is a remark.</p>
     */
    @NameInMap("Comment")
    public String comment;

    /**
     * <p>The DNS information of the record. The content varies depending on the record type. For more information, see &lt;props=&quot;china&quot;&gt;<a href="https://help.aliyun.com/document_detail/2708761.html">documentation</a>&lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/help/doc-detail/2708761.html">documentation</a>.</p>
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
     * <p>The back-to-origin HOST policy. This parameter takes effect when the record type is CNAME. Settings the HOST policy for back-to-origin requests. Valid values:</p>
     * <ul>
     * <li><strong>follow_hostname</strong>: follows the host record.</li>
     * <li><strong>follow_origin_domain</strong>: follows the Origin Domain Name.</li>
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
     * <p>Specifies whether to enable proxy acceleration for the record. Only CNAME records and A/AAAA records support proxy acceleration. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: Enable proxy acceleration.</li>
     * <li><strong>false</strong>: Disable proxy acceleration.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Proxied")
    public Boolean proxied;

    /**
     * <p>The ID of the record. You can call <a href="https://help.aliyun.com/document_detail/2850265.html">ListRecords</a> to obtain the record ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1234567890123</p>
     */
    @NameInMap("RecordId")
    public Long recordId;

    /**
     * <p>The origin server type of the CNAME record. This parameter is required when you add a CNAME record. Valid values:</p>
     * <ul>
     * <li><strong>OSS</strong>: OSS origin server.</li>
     * <li><strong>S3</strong>: S3 origin server.</li>
     * <li><strong>LB</strong>: load balancing origin server.</li>
     * <li><strong>OP</strong>: IPAM pool origin server.</li>
     * <li><strong>Domain</strong>: standard domain name origin server.</li>
     * </ul>
     * <p>If this parameter is not specified or is left empty, the default value is Domain, which indicates a standard domain name origin server type.</p>
     * 
     * <strong>example:</strong>
     * <p>OSS</p>
     */
    @NameInMap("SourceType")
    public String sourceType;

    /**
     * <p>The time-to-live (TTL) of the record, in seconds. Valid values: <strong>30 to 86400</strong>, or 1. A value of 1 indicates that the TTL of the record is automatically determined.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("Ttl")
    public Integer ttl;

    /**
     * <p>The DNS type of the record, such as A/AAAA, CNAME, or TXT.</p>
     * 
     * <strong>example:</strong>
     * <p>A/AAAA</p>
     */
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
