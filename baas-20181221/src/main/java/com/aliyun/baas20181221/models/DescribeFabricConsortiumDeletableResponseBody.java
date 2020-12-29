// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class DescribeFabricConsortiumDeletableResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ErrorCode")
    public Integer errorCode;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Result")
    public DescribeFabricConsortiumDeletableResponseBodyResult result;

    public static DescribeFabricConsortiumDeletableResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeFabricConsortiumDeletableResponseBody self = new DescribeFabricConsortiumDeletableResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeFabricConsortiumDeletableResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeFabricConsortiumDeletableResponseBody setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Integer getErrorCode() {
        return this.errorCode;
    }

    public DescribeFabricConsortiumDeletableResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeFabricConsortiumDeletableResponseBody setResult(DescribeFabricConsortiumDeletableResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DescribeFabricConsortiumDeletableResponseBodyResult getResult() {
        return this.result;
    }

    public static class DescribeFabricConsortiumDeletableResponseBodyResult extends TeaModel {
        @NameInMap("Deletable")
        public Boolean deletable;

        @NameInMap("Domain")
        public String domain;

        @NameInMap("Description")
        public String description;

        @NameInMap("ConsortiumId")
        public String consortiumId;

        @NameInMap("State")
        public String state;

        @NameInMap("ZoneId")
        public String zoneId;

        @NameInMap("CodeName")
        public String codeName;

        @NameInMap("ConsortiumName")
        public String consortiumName;

        @NameInMap("RegionId")
        public String regionId;

        public static DescribeFabricConsortiumDeletableResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeFabricConsortiumDeletableResponseBodyResult self = new DescribeFabricConsortiumDeletableResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeFabricConsortiumDeletableResponseBodyResult setDeletable(Boolean deletable) {
            this.deletable = deletable;
            return this;
        }
        public Boolean getDeletable() {
            return this.deletable;
        }

        public DescribeFabricConsortiumDeletableResponseBodyResult setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public DescribeFabricConsortiumDeletableResponseBodyResult setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeFabricConsortiumDeletableResponseBodyResult setConsortiumId(String consortiumId) {
            this.consortiumId = consortiumId;
            return this;
        }
        public String getConsortiumId() {
            return this.consortiumId;
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

        public DescribeFabricConsortiumDeletableResponseBodyResult setCodeName(String codeName) {
            this.codeName = codeName;
            return this;
        }
        public String getCodeName() {
            return this.codeName;
        }

        public DescribeFabricConsortiumDeletableResponseBodyResult setConsortiumName(String consortiumName) {
            this.consortiumName = consortiumName;
            return this;
        }
        public String getConsortiumName() {
            return this.consortiumName;
        }

        public DescribeFabricConsortiumDeletableResponseBodyResult setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

}
