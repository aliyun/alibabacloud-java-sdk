// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class GetClusterDiagnosisCheckItemsResponseBody extends TeaModel {
    @NameInMap("check_items")
    public java.util.List<GetClusterDiagnosisCheckItemsResponseBodyCheckItems> checkItems;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("is_success")
    public Boolean isSuccess;

    /**
     * <strong>example:</strong>
     * <p>1DFFD8C6-259E-582B-8B40-002C17DC****</p>
     */
    @NameInMap("request_id")
    public String requestId;

    public static GetClusterDiagnosisCheckItemsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetClusterDiagnosisCheckItemsResponseBody self = new GetClusterDiagnosisCheckItemsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetClusterDiagnosisCheckItemsResponseBody setCheckItems(java.util.List<GetClusterDiagnosisCheckItemsResponseBodyCheckItems> checkItems) {
        this.checkItems = checkItems;
        return this;
    }
    public java.util.List<GetClusterDiagnosisCheckItemsResponseBodyCheckItems> getCheckItems() {
        return this.checkItems;
    }

    public GetClusterDiagnosisCheckItemsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetClusterDiagnosisCheckItemsResponseBody setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
        return this;
    }
    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

    public GetClusterDiagnosisCheckItemsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetClusterDiagnosisCheckItemsResponseBodyCheckItems extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>Check whether the node can access host dns service</p>
         */
        @NameInMap("desc")
        public String desc;

        /**
         * <strong>example:</strong>
         * <p>HostDNS</p>
         */
        @NameInMap("display")
        public String display;

        /**
         * <strong>example:</strong>
         * <p>Node</p>
         */
        @NameInMap("group")
        public String group;

        /**
         * <strong>example:</strong>
         * <p>normal</p>
         */
        @NameInMap("level")
        public String level;

        /**
         * <strong>example:</strong>
         * <p>success</p>
         */
        @NameInMap("message")
        public String message;

        /**
         * <strong>example:</strong>
         * <p>HostDNS</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>True</p>
         */
        @NameInMap("refer")
        public String refer;

        /**
         * <strong>example:</strong>
         * <p>True</p>
         */
        @NameInMap("value")
        public String value;

        public static GetClusterDiagnosisCheckItemsResponseBodyCheckItems build(java.util.Map<String, ?> map) throws Exception {
            GetClusterDiagnosisCheckItemsResponseBodyCheckItems self = new GetClusterDiagnosisCheckItemsResponseBodyCheckItems();
            return TeaModel.build(map, self);
        }

        public GetClusterDiagnosisCheckItemsResponseBodyCheckItems setDesc(String desc) {
            this.desc = desc;
            return this;
        }
        public String getDesc() {
            return this.desc;
        }

        public GetClusterDiagnosisCheckItemsResponseBodyCheckItems setDisplay(String display) {
            this.display = display;
            return this;
        }
        public String getDisplay() {
            return this.display;
        }

        public GetClusterDiagnosisCheckItemsResponseBodyCheckItems setGroup(String group) {
            this.group = group;
            return this;
        }
        public String getGroup() {
            return this.group;
        }

        public GetClusterDiagnosisCheckItemsResponseBodyCheckItems setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public GetClusterDiagnosisCheckItemsResponseBodyCheckItems setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public GetClusterDiagnosisCheckItemsResponseBodyCheckItems setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetClusterDiagnosisCheckItemsResponseBodyCheckItems setRefer(String refer) {
            this.refer = refer;
            return this;
        }
        public String getRefer() {
            return this.refer;
        }

        public GetClusterDiagnosisCheckItemsResponseBodyCheckItems setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
