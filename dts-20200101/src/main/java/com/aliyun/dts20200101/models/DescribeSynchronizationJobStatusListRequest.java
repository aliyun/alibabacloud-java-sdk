// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class DescribeSynchronizationJobStatusListRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("SynchronizationJobIdListJsonStr")
    public String synchronizationJobIdListJsonStr;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("OwnerId")
    public String ownerId;

    @NameInMap("AccountId")
    public String accountId;

    public static DescribeSynchronizationJobStatusListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSynchronizationJobStatusListRequest self = new DescribeSynchronizationJobStatusListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSynchronizationJobStatusListRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeSynchronizationJobStatusListRequest setSynchronizationJobIdListJsonStr(String synchronizationJobIdListJsonStr) {
        this.synchronizationJobIdListJsonStr = synchronizationJobIdListJsonStr;
        return this;
    }
    public String getSynchronizationJobIdListJsonStr() {
        return this.synchronizationJobIdListJsonStr;
    }

    public DescribeSynchronizationJobStatusListRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public DescribeSynchronizationJobStatusListRequest setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

    public DescribeSynchronizationJobStatusListRequest setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

}
