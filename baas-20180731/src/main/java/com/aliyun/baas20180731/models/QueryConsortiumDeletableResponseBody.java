// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class QueryConsortiumDeletableResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    public Integer errorCode;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public QueryConsortiumDeletableResponseBodyResult result;

    @NameInMap("Success")
    public Boolean success;

    public static QueryConsortiumDeletableResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryConsortiumDeletableResponseBody self = new QueryConsortiumDeletableResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryConsortiumDeletableResponseBody setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Integer getErrorCode() {
        return this.errorCode;
    }

    public QueryConsortiumDeletableResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryConsortiumDeletableResponseBody setResult(QueryConsortiumDeletableResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public QueryConsortiumDeletableResponseBodyResult getResult() {
        return this.result;
    }

    public QueryConsortiumDeletableResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryConsortiumDeletableResponseBodyResult extends TeaModel {
        @NameInMap("CodeName")
        public String codeName;

        @NameInMap("ConsortiumId")
        public String consortiumId;

        @NameInMap("Deletable")
        public Boolean deletable;

        @NameInMap("Description")
        public String description;

        @NameInMap("Domain")
        public String domain;

        @NameInMap("Name")
        public String name;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("State")
        public String state;

        @NameInMap("ZoneId")
        public String zoneId;

        public static QueryConsortiumDeletableResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            QueryConsortiumDeletableResponseBodyResult self = new QueryConsortiumDeletableResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public QueryConsortiumDeletableResponseBodyResult setCodeName(String codeName) {
            this.codeName = codeName;
            return this;
        }
        public String getCodeName() {
            return this.codeName;
        }

        public QueryConsortiumDeletableResponseBodyResult setConsortiumId(String consortiumId) {
            this.consortiumId = consortiumId;
            return this;
        }
        public String getConsortiumId() {
            return this.consortiumId;
        }

        public QueryConsortiumDeletableResponseBodyResult setDeletable(Boolean deletable) {
            this.deletable = deletable;
            return this;
        }
        public Boolean getDeletable() {
            return this.deletable;
        }

        public QueryConsortiumDeletableResponseBodyResult setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public QueryConsortiumDeletableResponseBodyResult setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public QueryConsortiumDeletableResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryConsortiumDeletableResponseBodyResult setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public QueryConsortiumDeletableResponseBodyResult setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public QueryConsortiumDeletableResponseBodyResult setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

}
