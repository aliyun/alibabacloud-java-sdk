// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops_rdc20200303.models;

import com.aliyun.tea.*;

public class ListProjectCustomFieldsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ErrorMsg")
    public String errorMsg;

    @NameInMap("Object")
    public java.util.List<ListProjectCustomFieldsResponseBodyObject> object;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("Successful")
    public Boolean successful;

    public static ListProjectCustomFieldsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListProjectCustomFieldsResponseBody self = new ListProjectCustomFieldsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListProjectCustomFieldsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListProjectCustomFieldsResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public ListProjectCustomFieldsResponseBody setObject(java.util.List<ListProjectCustomFieldsResponseBodyObject> object) {
        this.object = object;
        return this;
    }
    public java.util.List<ListProjectCustomFieldsResponseBodyObject> getObject() {
        return this.object;
    }

    public ListProjectCustomFieldsResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListProjectCustomFieldsResponseBody setSuccessful(Boolean successful) {
        this.successful = successful;
        return this;
    }
    public Boolean getSuccessful() {
        return this.successful;
    }

    public static class ListProjectCustomFieldsResponseBodyObjectValues extends TeaModel {
        @NameInMap("Value")
        public String value;

        @NameInMap("Id")
        public String id;

        public static ListProjectCustomFieldsResponseBodyObjectValues build(java.util.Map<String, ?> map) throws Exception {
            ListProjectCustomFieldsResponseBodyObjectValues self = new ListProjectCustomFieldsResponseBodyObjectValues();
            return TeaModel.build(map, self);
        }

        public ListProjectCustomFieldsResponseBodyObjectValues setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public ListProjectCustomFieldsResponseBodyObjectValues setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

    public static class ListProjectCustomFieldsResponseBodyObject extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("Subtype")
        public String subtype;

        @NameInMap("Values")
        public java.util.List<ListProjectCustomFieldsResponseBodyObjectValues> values;

        @NameInMap("CustomFieldId")
        public String customFieldId;

        @NameInMap("Name")
        public String name;

        public static ListProjectCustomFieldsResponseBodyObject build(java.util.Map<String, ?> map) throws Exception {
            ListProjectCustomFieldsResponseBodyObject self = new ListProjectCustomFieldsResponseBodyObject();
            return TeaModel.build(map, self);
        }

        public ListProjectCustomFieldsResponseBodyObject setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListProjectCustomFieldsResponseBodyObject setSubtype(String subtype) {
            this.subtype = subtype;
            return this;
        }
        public String getSubtype() {
            return this.subtype;
        }

        public ListProjectCustomFieldsResponseBodyObject setValues(java.util.List<ListProjectCustomFieldsResponseBodyObjectValues> values) {
            this.values = values;
            return this;
        }
        public java.util.List<ListProjectCustomFieldsResponseBodyObjectValues> getValues() {
            return this.values;
        }

        public ListProjectCustomFieldsResponseBodyObject setCustomFieldId(String customFieldId) {
            this.customFieldId = customFieldId;
            return this;
        }
        public String getCustomFieldId() {
            return this.customFieldId;
        }

        public ListProjectCustomFieldsResponseBodyObject setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
