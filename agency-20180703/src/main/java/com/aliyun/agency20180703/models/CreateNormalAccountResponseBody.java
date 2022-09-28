// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20180703.models;

import com.aliyun.tea.*;

public class CreateNormalAccountResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public CreateNormalAccountResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("Success")
    public Boolean success;

    public static CreateNormalAccountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateNormalAccountResponseBody self = new CreateNormalAccountResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateNormalAccountResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateNormalAccountResponseBody setData(CreateNormalAccountResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateNormalAccountResponseBodyData getData() {
        return this.data;
    }

    public CreateNormalAccountResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateNormalAccountResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateNormalAccountResponseBodyDataResultEachData extends TeaModel {
        @NameInMap("Days")
        public Integer days;

        @NameInMap("Id")
        public Long id;

        @NameInMap("RegUrl")
        public String regUrl;

        public static CreateNormalAccountResponseBodyDataResultEachData build(java.util.Map<String, ?> map) throws Exception {
            CreateNormalAccountResponseBodyDataResultEachData self = new CreateNormalAccountResponseBodyDataResultEachData();
            return TeaModel.build(map, self);
        }

        public CreateNormalAccountResponseBodyDataResultEachData setDays(Integer days) {
            this.days = days;
            return this;
        }
        public Integer getDays() {
            return this.days;
        }

        public CreateNormalAccountResponseBodyDataResultEachData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public CreateNormalAccountResponseBodyDataResultEachData setRegUrl(String regUrl) {
            this.regUrl = regUrl;
            return this;
        }
        public String getRegUrl() {
            return this.regUrl;
        }

    }

    public static class CreateNormalAccountResponseBodyDataResult extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("EachData")
        public CreateNormalAccountResponseBodyDataResultEachData eachData;

        @NameInMap("Message")
        public String message;

        @NameInMap("Success")
        public Boolean success;

        public static CreateNormalAccountResponseBodyDataResult build(java.util.Map<String, ?> map) throws Exception {
            CreateNormalAccountResponseBodyDataResult self = new CreateNormalAccountResponseBodyDataResult();
            return TeaModel.build(map, self);
        }

        public CreateNormalAccountResponseBodyDataResult setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public CreateNormalAccountResponseBodyDataResult setEachData(CreateNormalAccountResponseBodyDataResultEachData eachData) {
            this.eachData = eachData;
            return this;
        }
        public CreateNormalAccountResponseBodyDataResultEachData getEachData() {
            return this.eachData;
        }

        public CreateNormalAccountResponseBodyDataResult setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public CreateNormalAccountResponseBodyDataResult setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

    public static class CreateNormalAccountResponseBodyData extends TeaModel {
        @NameInMap("Result")
        public java.util.List<CreateNormalAccountResponseBodyDataResult> result;

        public static CreateNormalAccountResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateNormalAccountResponseBodyData self = new CreateNormalAccountResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateNormalAccountResponseBodyData setResult(java.util.List<CreateNormalAccountResponseBodyDataResult> result) {
            this.result = result;
            return this;
        }
        public java.util.List<CreateNormalAccountResponseBodyDataResult> getResult() {
            return this.result;
        }

    }

}
