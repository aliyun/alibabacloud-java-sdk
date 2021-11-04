// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class ListFpShotDBResponseBody extends TeaModel {
    @NameInMap("FpShotDBList")
    public ListFpShotDBResponseBodyFpShotDBList fpShotDBList;

    @NameInMap("NonExistIds")
    public ListFpShotDBResponseBodyNonExistIds nonExistIds;

    @NameInMap("RequestId")
    public String requestId;

    public static ListFpShotDBResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListFpShotDBResponseBody self = new ListFpShotDBResponseBody();
        return TeaModel.build(map, self);
    }

    public ListFpShotDBResponseBody setFpShotDBList(ListFpShotDBResponseBodyFpShotDBList fpShotDBList) {
        this.fpShotDBList = fpShotDBList;
        return this;
    }
    public ListFpShotDBResponseBodyFpShotDBList getFpShotDBList() {
        return this.fpShotDBList;
    }

    public ListFpShotDBResponseBody setNonExistIds(ListFpShotDBResponseBodyNonExistIds nonExistIds) {
        this.nonExistIds = nonExistIds;
        return this;
    }
    public ListFpShotDBResponseBodyNonExistIds getNonExistIds() {
        return this.nonExistIds;
    }

    public ListFpShotDBResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListFpShotDBResponseBodyFpShotDBListFpShotDB extends TeaModel {
        @NameInMap("Description")
        public String description;

        @NameInMap("FpDBId")
        public String fpDBId;

        @NameInMap("ModelId")
        public Integer modelId;

        @NameInMap("Name")
        public String name;

        @NameInMap("Status")
        public String status;

        public static ListFpShotDBResponseBodyFpShotDBListFpShotDB build(java.util.Map<String, ?> map) throws Exception {
            ListFpShotDBResponseBodyFpShotDBListFpShotDB self = new ListFpShotDBResponseBodyFpShotDBListFpShotDB();
            return TeaModel.build(map, self);
        }

        public ListFpShotDBResponseBodyFpShotDBListFpShotDB setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListFpShotDBResponseBodyFpShotDBListFpShotDB setFpDBId(String fpDBId) {
            this.fpDBId = fpDBId;
            return this;
        }
        public String getFpDBId() {
            return this.fpDBId;
        }

        public ListFpShotDBResponseBodyFpShotDBListFpShotDB setModelId(Integer modelId) {
            this.modelId = modelId;
            return this;
        }
        public Integer getModelId() {
            return this.modelId;
        }

        public ListFpShotDBResponseBodyFpShotDBListFpShotDB setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListFpShotDBResponseBodyFpShotDBListFpShotDB setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class ListFpShotDBResponseBodyFpShotDBList extends TeaModel {
        @NameInMap("FpShotDB")
        public java.util.List<ListFpShotDBResponseBodyFpShotDBListFpShotDB> fpShotDB;

        public static ListFpShotDBResponseBodyFpShotDBList build(java.util.Map<String, ?> map) throws Exception {
            ListFpShotDBResponseBodyFpShotDBList self = new ListFpShotDBResponseBodyFpShotDBList();
            return TeaModel.build(map, self);
        }

        public ListFpShotDBResponseBodyFpShotDBList setFpShotDB(java.util.List<ListFpShotDBResponseBodyFpShotDBListFpShotDB> fpShotDB) {
            this.fpShotDB = fpShotDB;
            return this;
        }
        public java.util.List<ListFpShotDBResponseBodyFpShotDBListFpShotDB> getFpShotDB() {
            return this.fpShotDB;
        }

    }

    public static class ListFpShotDBResponseBodyNonExistIds extends TeaModel {
        @NameInMap("String")
        public java.util.List<String> string;

        public static ListFpShotDBResponseBodyNonExistIds build(java.util.Map<String, ?> map) throws Exception {
            ListFpShotDBResponseBodyNonExistIds self = new ListFpShotDBResponseBodyNonExistIds();
            return TeaModel.build(map, self);
        }

        public ListFpShotDBResponseBodyNonExistIds setString(java.util.List<String> string) {
            this.string = string;
            return this;
        }
        public java.util.List<String> getString() {
            return this.string;
        }

    }

}
