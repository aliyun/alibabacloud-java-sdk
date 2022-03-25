// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class DatasetCreateOneRequest extends TeaModel {
    @NameInMap("AliyunJwt")
    public String aliyunJwt;

    @NameInMap("Body")
    public DatasetCreateOneRequestBody body;

    @NameInMap("ProjectId")
    public Long projectId;

    public static DatasetCreateOneRequest build(java.util.Map<String, ?> map) throws Exception {
        DatasetCreateOneRequest self = new DatasetCreateOneRequest();
        return TeaModel.build(map, self);
    }

    public DatasetCreateOneRequest setAliyunJwt(String aliyunJwt) {
        this.aliyunJwt = aliyunJwt;
        return this;
    }
    public String getAliyunJwt() {
        return this.aliyunJwt;
    }

    public DatasetCreateOneRequest setBody(DatasetCreateOneRequestBody body) {
        this.body = body;
        return this;
    }
    public DatasetCreateOneRequestBody getBody() {
        return this.body;
    }

    public DatasetCreateOneRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public static class DatasetCreateOneRequestBodyNote extends TeaModel {
        @NameInMap("Description")
        public String description;

        @NameInMap("Name")
        public String name;

        public static DatasetCreateOneRequestBodyNote build(java.util.Map<String, ?> map) throws Exception {
            DatasetCreateOneRequestBodyNote self = new DatasetCreateOneRequestBodyNote();
            return TeaModel.build(map, self);
        }

        public DatasetCreateOneRequestBodyNote setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DatasetCreateOneRequestBodyNote setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class DatasetCreateOneRequestBody extends TeaModel {
        @NameInMap("BizType")
        public String bizType;

        @NameInMap("Note")
        public DatasetCreateOneRequestBodyNote note;

        @NameInMap("TypeId")
        public Long typeId;

        public static DatasetCreateOneRequestBody build(java.util.Map<String, ?> map) throws Exception {
            DatasetCreateOneRequestBody self = new DatasetCreateOneRequestBody();
            return TeaModel.build(map, self);
        }

        public DatasetCreateOneRequestBody setBizType(String bizType) {
            this.bizType = bizType;
            return this;
        }
        public String getBizType() {
            return this.bizType;
        }

        public DatasetCreateOneRequestBody setNote(DatasetCreateOneRequestBodyNote note) {
            this.note = note;
            return this;
        }
        public DatasetCreateOneRequestBodyNote getNote() {
            return this.note;
        }

        public DatasetCreateOneRequestBody setTypeId(Long typeId) {
            this.typeId = typeId;
            return this;
        }
        public Long getTypeId() {
            return this.typeId;
        }

    }

}
