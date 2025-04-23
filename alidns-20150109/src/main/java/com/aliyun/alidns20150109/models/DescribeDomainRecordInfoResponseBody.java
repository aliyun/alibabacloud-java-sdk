// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeDomainRecordInfoResponseBody extends TeaModel {
    /**
     * <p>The ID of the domain name.</p>
     * 
     * <strong>example:</strong>
     * <p>00efd71a-770e-4255-b54e-6fe5659baffe</p>
     */
    @NameInMap("DomainId")
    public String domainId;

    /**
     * <p>The domain name.</p>
     * 
     * <strong>example:</strong>
     * <p>dns-example.top</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The ID of the domain name group.</p>
     * 
     * <strong>example:</strong>
     * <p>2223</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>The name of the domain name group.</p>
     * 
     * <strong>example:</strong>
     * <p>MyGroup</p>
     */
    @NameInMap("GroupName")
    public String groupName;

    /**
     * <p>The DNS resolution line.</p>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("Line")
    public String line;

    /**
     * <p>The lock state of the DNS record. Valid values: <strong>true and false</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Locked")
    public Boolean locked;

    /**
     * <p>The priority of the mail exchanger (MX) record.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("Priority")
    public Long priority;

    /**
     * <p>The Punycode for the domain name. This parameter is returned only for Chinese domain names.</p>
     * 
     * <strong>example:</strong>
     * <p>xn--fsq270a.com</p>
     */
    @NameInMap("PunyCode")
    public String punyCode;

    /**
     * <p>The hostname.</p>
     * 
     * <strong>example:</strong>
     * <p>@</p>
     */
    @NameInMap("RR")
    public String RR;

    /**
     * <p>The ID of the DNS record.</p>
     * 
     * <strong>example:</strong>
     * <p>9999985</p>
     */
    @NameInMap("RecordId")
    public String recordId;

    /**
     * <p>The description of your DNS record.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Remark")
    public String remark;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>536E9CAD-DB30-4647-AC87-AA5CC38C5382</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The status of the DNS record. Valid values:</p>
     * <p>Enable: enabled</p>
     * <p>Disable: disabled</p>
     * 
     * <strong>example:</strong>
     * <p>Enable</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The time for which the DNS record is cached in a local DNS system.</p>
     * 
     * <strong>example:</strong>
     * <p>600</p>
     */
    @NameInMap("TTL")
    public Long TTL;

    /**
     * <p>The type of the DNS record.</p>
     * 
     * <strong>example:</strong>
     * <p>MX</p>
     */
    @NameInMap("Type")
    public String type;

    /**
     * <p>The record value.</p>
     * 
     * <strong>example:</strong>
     * <p>1.1.XX.XX</p>
     */
    @NameInMap("Value")
    public String value;

    public static DescribeDomainRecordInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainRecordInfoResponseBody self = new DescribeDomainRecordInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDomainRecordInfoResponseBody setDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }
    public String getDomainId() {
        return this.domainId;
    }

    public DescribeDomainRecordInfoResponseBody setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeDomainRecordInfoResponseBody setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public DescribeDomainRecordInfoResponseBody setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

    public DescribeDomainRecordInfoResponseBody setLine(String line) {
        this.line = line;
        return this;
    }
    public String getLine() {
        return this.line;
    }

    public DescribeDomainRecordInfoResponseBody setLocked(Boolean locked) {
        this.locked = locked;
        return this;
    }
    public Boolean getLocked() {
        return this.locked;
    }

    public DescribeDomainRecordInfoResponseBody setPriority(Long priority) {
        this.priority = priority;
        return this;
    }
    public Long getPriority() {
        return this.priority;
    }

    public DescribeDomainRecordInfoResponseBody setPunyCode(String punyCode) {
        this.punyCode = punyCode;
        return this;
    }
    public String getPunyCode() {
        return this.punyCode;
    }

    public DescribeDomainRecordInfoResponseBody setRR(String RR) {
        this.RR = RR;
        return this;
    }
    public String getRR() {
        return this.RR;
    }

    public DescribeDomainRecordInfoResponseBody setRecordId(String recordId) {
        this.recordId = recordId;
        return this;
    }
    public String getRecordId() {
        return this.recordId;
    }

    public DescribeDomainRecordInfoResponseBody setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public DescribeDomainRecordInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDomainRecordInfoResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeDomainRecordInfoResponseBody setTTL(Long TTL) {
        this.TTL = TTL;
        return this;
    }
    public Long getTTL() {
        return this.TTL;
    }

    public DescribeDomainRecordInfoResponseBody setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public DescribeDomainRecordInfoResponseBody setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
