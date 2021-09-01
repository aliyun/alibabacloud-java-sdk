// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fcc20210331.models;

import com.aliyun.tea.*;

public class ListUserLibraryByPageResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public ListUserLibraryByPageResponseBodyData data;

    public static ListUserLibraryByPageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListUserLibraryByPageResponseBody self = new ListUserLibraryByPageResponseBody();
        return TeaModel.build(map, self);
    }

    public ListUserLibraryByPageResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListUserLibraryByPageResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListUserLibraryByPageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListUserLibraryByPageResponseBody setData(ListUserLibraryByPageResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListUserLibraryByPageResponseBodyData getData() {
        return this.data;
    }

    public static class ListUserLibraryByPageResponseBodyDataRecords extends TeaModel {
        @NameInMap("ProfessionId")
        public Integer professionId;

        @NameInMap("CorpId")
        public String corpId;

        @NameInMap("IsvId")
        public String isvId;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("IsDelete")
        public String isDelete;

        @NameInMap("IdentityCard")
        public String identityCard;

        @NameInMap("Name")
        public String name;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("PhotoUrl")
        public String photoUrl;

        @NameInMap("ProfessionName")
        public String professionName;

        @NameInMap("Id")
        public Integer id;

        public static ListUserLibraryByPageResponseBodyDataRecords build(java.util.Map<String, ?> map) throws Exception {
            ListUserLibraryByPageResponseBodyDataRecords self = new ListUserLibraryByPageResponseBodyDataRecords();
            return TeaModel.build(map, self);
        }

        public ListUserLibraryByPageResponseBodyDataRecords setProfessionId(Integer professionId) {
            this.professionId = professionId;
            return this;
        }
        public Integer getProfessionId() {
            return this.professionId;
        }

        public ListUserLibraryByPageResponseBodyDataRecords setCorpId(String corpId) {
            this.corpId = corpId;
            return this;
        }
        public String getCorpId() {
            return this.corpId;
        }

        public ListUserLibraryByPageResponseBodyDataRecords setIsvId(String isvId) {
            this.isvId = isvId;
            return this;
        }
        public String getIsvId() {
            return this.isvId;
        }

        public ListUserLibraryByPageResponseBodyDataRecords setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListUserLibraryByPageResponseBodyDataRecords setIsDelete(String isDelete) {
            this.isDelete = isDelete;
            return this;
        }
        public String getIsDelete() {
            return this.isDelete;
        }

        public ListUserLibraryByPageResponseBodyDataRecords setIdentityCard(String identityCard) {
            this.identityCard = identityCard;
            return this;
        }
        public String getIdentityCard() {
            return this.identityCard;
        }

        public ListUserLibraryByPageResponseBodyDataRecords setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListUserLibraryByPageResponseBodyDataRecords setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListUserLibraryByPageResponseBodyDataRecords setPhotoUrl(String photoUrl) {
            this.photoUrl = photoUrl;
            return this;
        }
        public String getPhotoUrl() {
            return this.photoUrl;
        }

        public ListUserLibraryByPageResponseBodyDataRecords setProfessionName(String professionName) {
            this.professionName = professionName;
            return this;
        }
        public String getProfessionName() {
            return this.professionName;
        }

        public ListUserLibraryByPageResponseBodyDataRecords setId(Integer id) {
            this.id = id;
            return this;
        }
        public Integer getId() {
            return this.id;
        }

    }

    public static class ListUserLibraryByPageResponseBodyData extends TeaModel {
        @NameInMap("TotalPage")
        public Integer totalPage;

        @NameInMap("PageNum")
        public Integer pageNum;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        @NameInMap("Records")
        public java.util.List<ListUserLibraryByPageResponseBodyDataRecords> records;

        public static ListUserLibraryByPageResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListUserLibraryByPageResponseBodyData self = new ListUserLibraryByPageResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListUserLibraryByPageResponseBodyData setTotalPage(Integer totalPage) {
            this.totalPage = totalPage;
            return this;
        }
        public Integer getTotalPage() {
            return this.totalPage;
        }

        public ListUserLibraryByPageResponseBodyData setPageNum(Integer pageNum) {
            this.pageNum = pageNum;
            return this;
        }
        public Integer getPageNum() {
            return this.pageNum;
        }

        public ListUserLibraryByPageResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListUserLibraryByPageResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public ListUserLibraryByPageResponseBodyData setRecords(java.util.List<ListUserLibraryByPageResponseBodyDataRecords> records) {
            this.records = records;
            return this;
        }
        public java.util.List<ListUserLibraryByPageResponseBodyDataRecords> getRecords() {
            return this.records;
        }

    }

}
