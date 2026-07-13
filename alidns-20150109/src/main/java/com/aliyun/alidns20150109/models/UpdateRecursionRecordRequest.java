// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class UpdateRecursionRecordRequest extends TeaModel {
    /**
     * <p>A client token that ensures the idempotence of a request. Generate a unique value for this parameter on your client. The value can be up to 64 ASCII characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>21079fa016944979537637959d09bc</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The priority of the MX record. A smaller value indicates a higher priority. The value can be an integer from 1 to 99.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("Priority")
    public Integer priority;

    /**
     * <p>The ID of the DNS record.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>9*******</p>
     */
    @NameInMap("RecordId")
    public String recordId;

    /**
     * <p>The resolution line. The default value is <strong>default</strong>. For more information, see:</p>
     * <p>&lt;props=&quot;china&quot;&gt;</p>
     * <p><a href="https://help.aliyun.com/document_detail/29807.html">Lines</a></p>
     * <p>&lt;props=&quot;intl&quot;&gt;</p>
     * <p><a href="https://www.alibabacloud.com/help/en/doc-detail/29807.htm">Lines</a></p>
     * 
     * <strong>example:</strong>
     * <p>WebSDK</p>
     */
    @NameInMap("RequestSource")
    public String requestSource;

    /**
     * <p>The host record. This is the prefix of a domain name. Common prefixes are www, @, \* for wildcard DNS, and mail for mailboxes.</p>
     * <p>For example, to resolve @.example.com, set the host record to &quot;@&quot;. Do not leave it empty.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Rr")
    public String rr;

    /**
     * <p>The Time to Live (TTL) in seconds. Only the following values are supported: 5, 30, 60, 3600 (1 hour), 43200 (12 hours), and 86400 (24 hours). The default value is 60.</p>
     * 
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("Ttl")
    public Integer ttl;

    /**
     * <p>The type of the DNS record. The following types are supported: A: An IPv4 record that maps a domain name to an IPv4 address. AAAA: An IPv6 record that maps a domain name to an IPv6 address. CNAME: An alias record that points a domain name to another domain name. MX: A mail exchanger record that points a domain name to a mail server address. TXT: A text record that contains arbitrary human-readable text. SRV: A service record that identifies a server for a specific service. This is common in directory management for Microsoft systems.</p>
     * 
     * <strong>example:</strong>
     * <p>A</p>
     */
    @NameInMap("Type")
    public String type;

    /**
     * <p>The record value. Enter a value that corresponds to the DNS record type.</p>
     * 
     * <strong>example:</strong>
     * <p>1.1.XX.XX</p>
     */
    @NameInMap("Value")
    public String value;

    /**
     * <p>The weight. An integer from 1 to 100, inclusive. The default value is 1. You can set different weights for each address. DNS queries return addresses in proportion to their weights.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("Weight")
    public Integer weight;

    public static UpdateRecursionRecordRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateRecursionRecordRequest self = new UpdateRecursionRecordRequest();
        return TeaModel.build(map, self);
    }

    public UpdateRecursionRecordRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateRecursionRecordRequest setPriority(Integer priority) {
        this.priority = priority;
        return this;
    }
    public Integer getPriority() {
        return this.priority;
    }

    public UpdateRecursionRecordRequest setRecordId(String recordId) {
        this.recordId = recordId;
        return this;
    }
    public String getRecordId() {
        return this.recordId;
    }

    public UpdateRecursionRecordRequest setRequestSource(String requestSource) {
        this.requestSource = requestSource;
        return this;
    }
    public String getRequestSource() {
        return this.requestSource;
    }

    public UpdateRecursionRecordRequest setRr(String rr) {
        this.rr = rr;
        return this;
    }
    public String getRr() {
        return this.rr;
    }

    public UpdateRecursionRecordRequest setTtl(Integer ttl) {
        this.ttl = ttl;
        return this;
    }
    public Integer getTtl() {
        return this.ttl;
    }

    public UpdateRecursionRecordRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public UpdateRecursionRecordRequest setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

    public UpdateRecursionRecordRequest setWeight(Integer weight) {
        this.weight = weight;
        return this;
    }
    public Integer getWeight() {
        return this.weight;
    }

}
