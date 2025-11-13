// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetAiRtcAuthCodeListRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>17712***</p>
     */
    @NameInMap("LicenseItemId")
    public String licenseItemId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("NeedTotalCount")
    public Boolean needTotalCount;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNo")
    public Long pageNo;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Status")
    public Integer status;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Type")
    public Integer type;

    public static GetAiRtcAuthCodeListRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAiRtcAuthCodeListRequest self = new GetAiRtcAuthCodeListRequest();
        return TeaModel.build(map, self);
    }

    public GetAiRtcAuthCodeListRequest setLicenseItemId(String licenseItemId) {
        this.licenseItemId = licenseItemId;
        return this;
    }
    public String getLicenseItemId() {
        return this.licenseItemId;
    }

    public GetAiRtcAuthCodeListRequest setNeedTotalCount(Boolean needTotalCount) {
        this.needTotalCount = needTotalCount;
        return this;
    }
    public Boolean getNeedTotalCount() {
        return this.needTotalCount;
    }

    public GetAiRtcAuthCodeListRequest setPageNo(Long pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Long getPageNo() {
        return this.pageNo;
    }

    public GetAiRtcAuthCodeListRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public GetAiRtcAuthCodeListRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

    public GetAiRtcAuthCodeListRequest setType(Integer type) {
        this.type = type;
        return this;
    }
    public Integer getType() {
        return this.type;
    }

}
