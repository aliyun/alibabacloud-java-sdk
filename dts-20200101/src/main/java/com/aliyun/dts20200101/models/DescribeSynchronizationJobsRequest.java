// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class DescribeSynchronizationJobsRequest extends TeaModel {
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PageNum")
    public Integer pageNum;

    @NameInMap("SynchronizationJobName")
    public String synchronizationJobName;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("OwnerId")
    public String ownerId;

    @NameInMap("AccountId")
    public String accountId;

    @NameInMap("Tag")
    public java.util.List<DescribeSynchronizationJobsRequestTag> tag;

    public static DescribeSynchronizationJobsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSynchronizationJobsRequest self = new DescribeSynchronizationJobsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSynchronizationJobsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeSynchronizationJobsRequest setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public DescribeSynchronizationJobsRequest setSynchronizationJobName(String synchronizationJobName) {
        this.synchronizationJobName = synchronizationJobName;
        return this;
    }
    public String getSynchronizationJobName() {
        return this.synchronizationJobName;
    }

    public DescribeSynchronizationJobsRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public DescribeSynchronizationJobsRequest setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

    public DescribeSynchronizationJobsRequest setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public DescribeSynchronizationJobsRequest setTag(java.util.List<DescribeSynchronizationJobsRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<DescribeSynchronizationJobsRequestTag> getTag() {
        return this.tag;
    }

    public static class DescribeSynchronizationJobsRequestTag extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static DescribeSynchronizationJobsRequestTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeSynchronizationJobsRequestTag self = new DescribeSynchronizationJobsRequestTag();
            return TeaModel.build(map, self);
        }

        public DescribeSynchronizationJobsRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeSynchronizationJobsRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
