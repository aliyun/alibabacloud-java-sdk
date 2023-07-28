// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class BatchApplyAdviceByIdListRequest extends TeaModel {
    @NameInMap("AdviceDate")
    public Long adviceDate;

    @NameInMap("AdviceIdList")
    public String adviceIdList;

    /**
     * <p>The message returned for the operation. Valid values:</p>
     * <br>
     * <p>*   **SUCCESS** is returned if the operation is successful.</p>
     * <p>*   An error message is returned if the operation fails.</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static BatchApplyAdviceByIdListRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchApplyAdviceByIdListRequest self = new BatchApplyAdviceByIdListRequest();
        return TeaModel.build(map, self);
    }

    public BatchApplyAdviceByIdListRequest setAdviceDate(Long adviceDate) {
        this.adviceDate = adviceDate;
        return this;
    }
    public Long getAdviceDate() {
        return this.adviceDate;
    }

    public BatchApplyAdviceByIdListRequest setAdviceIdList(String adviceIdList) {
        this.adviceIdList = adviceIdList;
        return this;
    }
    public String getAdviceIdList() {
        return this.adviceIdList;
    }

    public BatchApplyAdviceByIdListRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public BatchApplyAdviceByIdListRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
