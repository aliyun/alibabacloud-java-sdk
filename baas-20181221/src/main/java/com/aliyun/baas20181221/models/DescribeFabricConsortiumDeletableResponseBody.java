// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class DescribeFabricConsortiumDeletableResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    public Integer errorCode;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public DescribeFabricConsortiumDeletableResponseBodyResult result;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeFabricConsortiumDeletableResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeFabricConsortiumDeletableResponseBody self = new DescribeFabricConsortiumDeletableResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeFabricConsortiumDeletableResponseBody setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Integer getErrorCode() {
        return this.errorCode;
    }

    public DescribeFabricConsortiumDeletableResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeFabricConsortiumDeletableResponseBody setResult(DescribeFabricConsortiumDeletableResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DescribeFabricConsortiumDeletableResponseBodyResult getResult() {
        return this.result;
    }

    public DescribeFabricConsortiumDeletableResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeFabricConsortiumDeletableResponseBodyResult extends TeaModel {
        @NameInMap("CodeName")
        public String codeName;

        @NameInMap("ConsortiumId")
        public String consortiumId;

        @NameInMap("ConsortiumName")
        public String consortiumName;

        @NameInMap("Deletable")
        public Boolean deletable;

        @NameInMap("Description")
        public String description;

        @NameInMap("Domain")
        public String domain;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("State")
        public String state;

        @NameInMap("ZoneId")
        public String zoneId;

        public static DescribeFabricConsortiumDeletableResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeFabricConsortiumDeletableResponseBodyResult self = new DescribeFabricConsortiumDeletableResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeFabricConsortiumDeletableResponseBodyResult setCodeName(String codeName) {
            this.codeName = codeName;
            return this;
        }
        public String getCodeName() {
            return this.codeName;
        }

        public DescribeFabricConsortiumDeletableResponseBodyResult setConsortiumId(String consortiumId) {
            this.consortiumId = consortiumId;
            return this;
        }
        public String getConsortiumId() {
            return this.consortiumId;
        }

        public DescribeFabricConsortiumDeletableResponseBodyResult setConsortiumName(String consortiumName) {
            this.consortiumName = consortiumName;
            return this;
        }
        public String getConsortiumName() {
            return this.consortiumName;
        }

        public DescribeFabricConsortiumDeletableResponseBodyResult setDeletable(Boolean deletable) {
            this.deletable = deletable;
            return this;
        }
        public Boolean getDeletable() {
            return this.deletable;
        }

        public DescribeFabricConsortiumDeletableResponseBodyResult setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeFabricConsortiumDeletableResponseBodyResult setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public DescribeFabricConsortiumDeletableResponseBodyResult setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeFabricConsortiumDeletableResponseBodyResult setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public DescribeFabricConsortiumDeletableResponseBodyResult setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

}
