// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fcc20210331.models;

import com.aliyun.tea.*;

public class GetUserLibraryByIdResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public GetUserLibraryByIdResponseBodyData data;

    public static GetUserLibraryByIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetUserLibraryByIdResponseBody self = new GetUserLibraryByIdResponseBody();
        return TeaModel.build(map, self);
    }

    public GetUserLibraryByIdResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetUserLibraryByIdResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetUserLibraryByIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetUserLibraryByIdResponseBody setData(GetUserLibraryByIdResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetUserLibraryByIdResponseBodyData getData() {
        return this.data;
    }

    public static class GetUserLibraryByIdResponseBodyData extends TeaModel {
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

        public static GetUserLibraryByIdResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetUserLibraryByIdResponseBodyData self = new GetUserLibraryByIdResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetUserLibraryByIdResponseBodyData setProfessionId(Integer professionId) {
            this.professionId = professionId;
            return this;
        }
        public Integer getProfessionId() {
            return this.professionId;
        }

        public GetUserLibraryByIdResponseBodyData setCorpId(String corpId) {
            this.corpId = corpId;
            return this;
        }
        public String getCorpId() {
            return this.corpId;
        }

        public GetUserLibraryByIdResponseBodyData setIsvId(String isvId) {
            this.isvId = isvId;
            return this;
        }
        public String getIsvId() {
            return this.isvId;
        }

        public GetUserLibraryByIdResponseBodyData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public GetUserLibraryByIdResponseBodyData setIsDelete(String isDelete) {
            this.isDelete = isDelete;
            return this;
        }
        public String getIsDelete() {
            return this.isDelete;
        }

        public GetUserLibraryByIdResponseBodyData setIdentityCard(String identityCard) {
            this.identityCard = identityCard;
            return this;
        }
        public String getIdentityCard() {
            return this.identityCard;
        }

        public GetUserLibraryByIdResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetUserLibraryByIdResponseBodyData setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public GetUserLibraryByIdResponseBodyData setPhotoUrl(String photoUrl) {
            this.photoUrl = photoUrl;
            return this;
        }
        public String getPhotoUrl() {
            return this.photoUrl;
        }

        public GetUserLibraryByIdResponseBodyData setProfessionName(String professionName) {
            this.professionName = professionName;
            return this;
        }
        public String getProfessionName() {
            return this.professionName;
        }

        public GetUserLibraryByIdResponseBodyData setId(Integer id) {
            this.id = id;
            return this;
        }
        public Integer getId() {
            return this.id;
        }

    }

}
