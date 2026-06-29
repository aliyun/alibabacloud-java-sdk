// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class CreateRecordShrinkRequest extends TeaModel {
    /**
     * <p>The origin authentication information for the CNAME record.</p>
     */
    @NameInMap("AuthConf")
    public String authConfShrink;

    /**
     * <p>Used to tag the business scenario of the DNS record. This parameter is required when proxy acceleration is enabled for the DNS record (i.e., when the proxied parameter is set to true), and is not required when proxy acceleration is disabled (i.e., when the proxied parameter is set to false). Valid values:</p>
     * <ul>
     * <li><strong>image_video</strong>: Image and video.</li>
     * <li><strong>api</strong>: API.</li>
     * <li><strong>web</strong>: Web page.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>web</p>
     */
    @NameInMap("BizName")
    public String bizName;

    /**
     * <p>The comment for the record, with a maximum length of 100 characters.</p>
     * 
     * <strong>example:</strong>
     * <p>This is a remark.</p>
     */
    @NameInMap("Comment")
    public String comment;

    /**
     * <p>The DNS information of the record. Different types of records require different content for this field. For more information, see
     * &lt;props=&quot;china&quot;&gt;<a href="https://help.aliyun.com/document_detail/2708761.html">Documentation</a>&lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/help/doc-detail/2708761.html">Documentation</a>
     * .</p>
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
     * <p>The origin host policy. This takes effect when the record type is CNAME. It specifies the host policy for back-to-origin requests. Two modes are available:</p>
     * <ul>
     * <li><strong>follow_hostname</strong>: Follow the request host.</li>
     * <li><strong>follow_origin_domain</strong>: Follow the origin domain.</li>
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
     * <p>Specifies whether to enable proxy acceleration for the record. Only CNAME records or A/AAAA records (i.e., when the type parameter is set to A/AAAA or CNAME) can enable proxy acceleration. Valid values:</p>
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
     * <p>The record name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://www.example.com">www.example.com</a></p>
     */
    @NameInMap("RecordName")
    public String recordName;

    /**
     * <p>The site ID, which can be obtained by calling the <a href="https://help.aliyun.com/document_detail/2850189.html">ListSites</a> API.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1234567890123</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    /**
     * <p>The origin type of the CNAME record. This parameter is required when adding a CNAME record (i.e., when the type parameter is set to CNAME). Valid values:</p>
     * <ul>
     * <li><strong>OSS</strong>: OSS origin.</li>
     * <li><strong>S3</strong>: S3 origin.</li>
     * <li><strong>LB</strong>: Load balancer origin.</li>
     * <li><strong>OP</strong>: Origin pool origin.</li>
     * <li><strong>Domain</strong>: Standard domain origin.</li>
     * </ul>
     * <p>If this parameter is not specified or is left empty, it defaults to Domain, which is the standard domain origin type.</p>
     * 
     * <strong>example:</strong>
     * <p>OSS</p>
     */
    @NameInMap("SourceType")
    public String sourceType;

    /**
     * <p>The time-to-live (TTL) of the record, in seconds. When set to 1, the TTL is automatic.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("Ttl")
    public Integer ttl;

    /**
     * <p>The DNS type of the record, such as <strong>A/AAAA</strong>, <strong>CNAME</strong>, <strong>TXT</strong>, etc.</p>
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

    public CreateRecordShrinkRequest setHttpPorts(String httpPorts) {
        this.httpPorts = httpPorts;
        return this;
    }
    public String getHttpPorts() {
        return this.httpPorts;
    }

    public CreateRecordShrinkRequest setHttpsPorts(String httpsPorts) {
        this.httpsPorts = httpsPorts;
        return this;
    }
    public String getHttpsPorts() {
        return this.httpsPorts;
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
