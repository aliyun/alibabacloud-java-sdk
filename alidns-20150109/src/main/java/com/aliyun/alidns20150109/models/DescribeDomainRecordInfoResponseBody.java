// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeDomainRecordInfoResponseBody extends TeaModel {
    @NameInMap("DomainId")
    public String domainId;

    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("GroupName")
    public String groupName;

    @NameInMap("Line")
    public String line;

    @NameInMap("Locked")
    public Boolean locked;

    @NameInMap("Priority")
    public Long priority;

    @NameInMap("PunyCode")
    public String punyCode;

    @NameInMap("RR")
    public String RR;

    @NameInMap("RecordId")
    public String recordId;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Status")
    public String status;

    @NameInMap("TTL")
    public Long TTL;

    @NameInMap("Type")
    public String type;

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
