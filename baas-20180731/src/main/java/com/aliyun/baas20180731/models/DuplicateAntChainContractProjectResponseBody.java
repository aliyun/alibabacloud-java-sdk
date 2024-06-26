// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DuplicateAntChainContractProjectResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public DuplicateAntChainContractProjectResponseBodyResult result;

    public static DuplicateAntChainContractProjectResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DuplicateAntChainContractProjectResponseBody self = new DuplicateAntChainContractProjectResponseBody();
        return TeaModel.build(map, self);
    }

    public DuplicateAntChainContractProjectResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DuplicateAntChainContractProjectResponseBody setResult(DuplicateAntChainContractProjectResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DuplicateAntChainContractProjectResponseBodyResult getResult() {
        return this.result;
    }

    public static class DuplicateAntChainContractProjectResponseBodyResult extends TeaModel {
        @NameInMap("ConsortiumId")
        public String consortiumId;

        @NameInMap("Description")
        public String description;

        @NameInMap("GmtCreate")
        public Long gmtCreate;

        @NameInMap("GmtModified")
        public Long gmtModified;

        @NameInMap("Id")
        public String id;

        @NameInMap("Name")
        public String name;

        @NameInMap("Version")
        public String version;

        public static DuplicateAntChainContractProjectResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DuplicateAntChainContractProjectResponseBodyResult self = new DuplicateAntChainContractProjectResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DuplicateAntChainContractProjectResponseBodyResult setConsortiumId(String consortiumId) {
            this.consortiumId = consortiumId;
            return this;
        }
        public String getConsortiumId() {
            return this.consortiumId;
        }

        public DuplicateAntChainContractProjectResponseBodyResult setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DuplicateAntChainContractProjectResponseBodyResult setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public DuplicateAntChainContractProjectResponseBodyResult setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public DuplicateAntChainContractProjectResponseBodyResult setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public DuplicateAntChainContractProjectResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DuplicateAntChainContractProjectResponseBodyResult setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

}
