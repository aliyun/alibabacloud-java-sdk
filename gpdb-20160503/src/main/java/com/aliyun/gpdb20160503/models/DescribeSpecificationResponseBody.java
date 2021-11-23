// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeSpecificationResponseBody extends TeaModel {
    @NameInMap("DBInstanceClass")
    public java.util.List<DescribeSpecificationResponseBodyDBInstanceClass> DBInstanceClass;

    @NameInMap("DBInstanceGroupCount")
    public java.util.List<DescribeSpecificationResponseBodyDBInstanceGroupCount> DBInstanceGroupCount;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("StorageNotice")
    public java.util.List<DescribeSpecificationResponseBodyStorageNotice> storageNotice;

    public static DescribeSpecificationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSpecificationResponseBody self = new DescribeSpecificationResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSpecificationResponseBody setDBInstanceClass(java.util.List<DescribeSpecificationResponseBodyDBInstanceClass> DBInstanceClass) {
        this.DBInstanceClass = DBInstanceClass;
        return this;
    }
    public java.util.List<DescribeSpecificationResponseBodyDBInstanceClass> getDBInstanceClass() {
        return this.DBInstanceClass;
    }

    public DescribeSpecificationResponseBody setDBInstanceGroupCount(java.util.List<DescribeSpecificationResponseBodyDBInstanceGroupCount> DBInstanceGroupCount) {
        this.DBInstanceGroupCount = DBInstanceGroupCount;
        return this;
    }
    public java.util.List<DescribeSpecificationResponseBodyDBInstanceGroupCount> getDBInstanceGroupCount() {
        return this.DBInstanceGroupCount;
    }

    public DescribeSpecificationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSpecificationResponseBody setStorageNotice(java.util.List<DescribeSpecificationResponseBodyStorageNotice> storageNotice) {
        this.storageNotice = storageNotice;
        return this;
    }
    public java.util.List<DescribeSpecificationResponseBodyStorageNotice> getStorageNotice() {
        return this.storageNotice;
    }

    public static class DescribeSpecificationResponseBodyDBInstanceClass extends TeaModel {
        @NameInMap("Text")
        public String text;

        @NameInMap("Value")
        public String value;

        public static DescribeSpecificationResponseBodyDBInstanceClass build(java.util.Map<String, ?> map) throws Exception {
            DescribeSpecificationResponseBodyDBInstanceClass self = new DescribeSpecificationResponseBodyDBInstanceClass();
            return TeaModel.build(map, self);
        }

        public DescribeSpecificationResponseBodyDBInstanceClass setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

        public DescribeSpecificationResponseBodyDBInstanceClass setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeSpecificationResponseBodyDBInstanceGroupCount extends TeaModel {
        @NameInMap("Text")
        public String text;

        @NameInMap("Value")
        public String value;

        public static DescribeSpecificationResponseBodyDBInstanceGroupCount build(java.util.Map<String, ?> map) throws Exception {
            DescribeSpecificationResponseBodyDBInstanceGroupCount self = new DescribeSpecificationResponseBodyDBInstanceGroupCount();
            return TeaModel.build(map, self);
        }

        public DescribeSpecificationResponseBodyDBInstanceGroupCount setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

        public DescribeSpecificationResponseBodyDBInstanceGroupCount setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeSpecificationResponseBodyStorageNotice extends TeaModel {
        @NameInMap("Text")
        public String text;

        @NameInMap("Value")
        public String value;

        public static DescribeSpecificationResponseBodyStorageNotice build(java.util.Map<String, ?> map) throws Exception {
            DescribeSpecificationResponseBodyStorageNotice self = new DescribeSpecificationResponseBodyStorageNotice();
            return TeaModel.build(map, self);
        }

        public DescribeSpecificationResponseBodyStorageNotice setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

        public DescribeSpecificationResponseBodyStorageNotice setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
