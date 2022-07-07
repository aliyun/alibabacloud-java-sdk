// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mm_multiply20210901.models;

import com.aliyun.tea.*;

public class ListContractResponseBody extends TeaModel {
    @NameInMap("Code")
    public Long code;

    @NameInMap("ContractModels")
    public java.util.List<ListContractResponseBodyContractModels> contractModels;

    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("Message")
    public String message;

    @NameInMap("RecordsPerPage")
    public Integer recordsPerPage;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("TotalPages")
    public Integer totalPages;

    @NameInMap("TotalRecords")
    public Integer totalRecords;

    public static ListContractResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListContractResponseBody self = new ListContractResponseBody();
        return TeaModel.build(map, self);
    }

    public ListContractResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public ListContractResponseBody setContractModels(java.util.List<ListContractResponseBodyContractModels> contractModels) {
        this.contractModels = contractModels;
        return this;
    }
    public java.util.List<ListContractResponseBodyContractModels> getContractModels() {
        return this.contractModels;
    }

    public ListContractResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListContractResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListContractResponseBody setRecordsPerPage(Integer recordsPerPage) {
        this.recordsPerPage = recordsPerPage;
        return this;
    }
    public Integer getRecordsPerPage() {
        return this.recordsPerPage;
    }

    public ListContractResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListContractResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListContractResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListContractResponseBody setTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
        return this;
    }
    public Integer getTotalPages() {
        return this.totalPages;
    }

    public ListContractResponseBody setTotalRecords(Integer totalRecords) {
        this.totalRecords = totalRecords;
        return this;
    }
    public Integer getTotalRecords() {
        return this.totalRecords;
    }

    public static class ListContractResponseBodyContractModels extends TeaModel {
        @NameInMap("ContractExtInfo")
        public java.util.Map<String, ?> contractExtInfo;

        @NameInMap("ContractId")
        public String contractId;

        @NameInMap("ContractName")
        public String contractName;

        @NameInMap("CreateTime")
        public String createTime;

        // 过期时间
        @NameInMap("ExpireTime")
        public String expireTime;

        @NameInMap("ExtInfo")
        public java.util.Map<String, ?> extInfo;

        // 甲方
        @NameInMap("FirstParty")
        public String firstParty;

        // 甲方id
        @NameInMap("FirstPartyId")
        public String firstPartyId;

        // 乙方
        @NameInMap("SecondParty")
        public String secondParty;

        // 乙方id
        @NameInMap("SecondPartyId")
        public String secondPartyId;

        // 签约状态
        @NameInMap("SignStatus")
        public String signStatus;

        // 开始时间
        @NameInMap("StartTime")
        public String startTime;

        public static ListContractResponseBodyContractModels build(java.util.Map<String, ?> map) throws Exception {
            ListContractResponseBodyContractModels self = new ListContractResponseBodyContractModels();
            return TeaModel.build(map, self);
        }

        public ListContractResponseBodyContractModels setContractExtInfo(java.util.Map<String, ?> contractExtInfo) {
            this.contractExtInfo = contractExtInfo;
            return this;
        }
        public java.util.Map<String, ?> getContractExtInfo() {
            return this.contractExtInfo;
        }

        public ListContractResponseBodyContractModels setContractId(String contractId) {
            this.contractId = contractId;
            return this;
        }
        public String getContractId() {
            return this.contractId;
        }

        public ListContractResponseBodyContractModels setContractName(String contractName) {
            this.contractName = contractName;
            return this;
        }
        public String getContractName() {
            return this.contractName;
        }

        public ListContractResponseBodyContractModels setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListContractResponseBodyContractModels setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public ListContractResponseBodyContractModels setExtInfo(java.util.Map<String, ?> extInfo) {
            this.extInfo = extInfo;
            return this;
        }
        public java.util.Map<String, ?> getExtInfo() {
            return this.extInfo;
        }

        public ListContractResponseBodyContractModels setFirstParty(String firstParty) {
            this.firstParty = firstParty;
            return this;
        }
        public String getFirstParty() {
            return this.firstParty;
        }

        public ListContractResponseBodyContractModels setFirstPartyId(String firstPartyId) {
            this.firstPartyId = firstPartyId;
            return this;
        }
        public String getFirstPartyId() {
            return this.firstPartyId;
        }

        public ListContractResponseBodyContractModels setSecondParty(String secondParty) {
            this.secondParty = secondParty;
            return this;
        }
        public String getSecondParty() {
            return this.secondParty;
        }

        public ListContractResponseBodyContractModels setSecondPartyId(String secondPartyId) {
            this.secondPartyId = secondPartyId;
            return this;
        }
        public String getSecondPartyId() {
            return this.secondPartyId;
        }

        public ListContractResponseBodyContractModels setSignStatus(String signStatus) {
            this.signStatus = signStatus;
            return this;
        }
        public String getSignStatus() {
            return this.signStatus;
        }

        public ListContractResponseBodyContractModels setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

    }

}
