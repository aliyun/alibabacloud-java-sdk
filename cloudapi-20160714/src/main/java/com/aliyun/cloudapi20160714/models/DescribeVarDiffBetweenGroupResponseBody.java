// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeVarDiffBetweenGroupResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("VariableDiffs")
    public DescribeVarDiffBetweenGroupResponseBodyVariableDiffs variableDiffs;

    public static DescribeVarDiffBetweenGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeVarDiffBetweenGroupResponseBody self = new DescribeVarDiffBetweenGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeVarDiffBetweenGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeVarDiffBetweenGroupResponseBody setVariableDiffs(DescribeVarDiffBetweenGroupResponseBodyVariableDiffs variableDiffs) {
        this.variableDiffs = variableDiffs;
        return this;
    }
    public DescribeVarDiffBetweenGroupResponseBodyVariableDiffs getVariableDiffs() {
        return this.variableDiffs;
    }

    public static class DescribeVarDiffBetweenGroupResponseBodyVariableDiffsVariableDiffTest extends TeaModel {
        @NameInMap("DiffStatus")
        public String diffStatus;

        @NameInMap("OldValue")
        public String oldValue;

        @NameInMap("NewValue")
        public String newValue;

        public static DescribeVarDiffBetweenGroupResponseBodyVariableDiffsVariableDiffTest build(java.util.Map<String, ?> map) throws Exception {
            DescribeVarDiffBetweenGroupResponseBodyVariableDiffsVariableDiffTest self = new DescribeVarDiffBetweenGroupResponseBodyVariableDiffsVariableDiffTest();
            return TeaModel.build(map, self);
        }

        public DescribeVarDiffBetweenGroupResponseBodyVariableDiffsVariableDiffTest setDiffStatus(String diffStatus) {
            this.diffStatus = diffStatus;
            return this;
        }
        public String getDiffStatus() {
            return this.diffStatus;
        }

        public DescribeVarDiffBetweenGroupResponseBodyVariableDiffsVariableDiffTest setOldValue(String oldValue) {
            this.oldValue = oldValue;
            return this;
        }
        public String getOldValue() {
            return this.oldValue;
        }

        public DescribeVarDiffBetweenGroupResponseBodyVariableDiffsVariableDiffTest setNewValue(String newValue) {
            this.newValue = newValue;
            return this;
        }
        public String getNewValue() {
            return this.newValue;
        }

    }

    public static class DescribeVarDiffBetweenGroupResponseBodyVariableDiffsVariableDiffPre extends TeaModel {
        @NameInMap("DiffStatus")
        public String diffStatus;

        @NameInMap("OldValue")
        public String oldValue;

        @NameInMap("NewValue")
        public String newValue;

        public static DescribeVarDiffBetweenGroupResponseBodyVariableDiffsVariableDiffPre build(java.util.Map<String, ?> map) throws Exception {
            DescribeVarDiffBetweenGroupResponseBodyVariableDiffsVariableDiffPre self = new DescribeVarDiffBetweenGroupResponseBodyVariableDiffsVariableDiffPre();
            return TeaModel.build(map, self);
        }

        public DescribeVarDiffBetweenGroupResponseBodyVariableDiffsVariableDiffPre setDiffStatus(String diffStatus) {
            this.diffStatus = diffStatus;
            return this;
        }
        public String getDiffStatus() {
            return this.diffStatus;
        }

        public DescribeVarDiffBetweenGroupResponseBodyVariableDiffsVariableDiffPre setOldValue(String oldValue) {
            this.oldValue = oldValue;
            return this;
        }
        public String getOldValue() {
            return this.oldValue;
        }

        public DescribeVarDiffBetweenGroupResponseBodyVariableDiffsVariableDiffPre setNewValue(String newValue) {
            this.newValue = newValue;
            return this;
        }
        public String getNewValue() {
            return this.newValue;
        }

    }

    public static class DescribeVarDiffBetweenGroupResponseBodyVariableDiffsVariableDiffRelease extends TeaModel {
        @NameInMap("DiffStatus")
        public String diffStatus;

        @NameInMap("OldValue")
        public String oldValue;

        @NameInMap("NewValue")
        public String newValue;

        public static DescribeVarDiffBetweenGroupResponseBodyVariableDiffsVariableDiffRelease build(java.util.Map<String, ?> map) throws Exception {
            DescribeVarDiffBetweenGroupResponseBodyVariableDiffsVariableDiffRelease self = new DescribeVarDiffBetweenGroupResponseBodyVariableDiffsVariableDiffRelease();
            return TeaModel.build(map, self);
        }

        public DescribeVarDiffBetweenGroupResponseBodyVariableDiffsVariableDiffRelease setDiffStatus(String diffStatus) {
            this.diffStatus = diffStatus;
            return this;
        }
        public String getDiffStatus() {
            return this.diffStatus;
        }

        public DescribeVarDiffBetweenGroupResponseBodyVariableDiffsVariableDiffRelease setOldValue(String oldValue) {
            this.oldValue = oldValue;
            return this;
        }
        public String getOldValue() {
            return this.oldValue;
        }

        public DescribeVarDiffBetweenGroupResponseBodyVariableDiffsVariableDiffRelease setNewValue(String newValue) {
            this.newValue = newValue;
            return this;
        }
        public String getNewValue() {
            return this.newValue;
        }

    }

    public static class DescribeVarDiffBetweenGroupResponseBodyVariableDiffsVariableDiff extends TeaModel {
        @NameInMap("VarName")
        public String varName;

        @NameInMap("Test")
        public DescribeVarDiffBetweenGroupResponseBodyVariableDiffsVariableDiffTest test;

        @NameInMap("Pre")
        public DescribeVarDiffBetweenGroupResponseBodyVariableDiffsVariableDiffPre pre;

        @NameInMap("Release")
        public DescribeVarDiffBetweenGroupResponseBodyVariableDiffsVariableDiffRelease release;

        public static DescribeVarDiffBetweenGroupResponseBodyVariableDiffsVariableDiff build(java.util.Map<String, ?> map) throws Exception {
            DescribeVarDiffBetweenGroupResponseBodyVariableDiffsVariableDiff self = new DescribeVarDiffBetweenGroupResponseBodyVariableDiffsVariableDiff();
            return TeaModel.build(map, self);
        }

        public DescribeVarDiffBetweenGroupResponseBodyVariableDiffsVariableDiff setVarName(String varName) {
            this.varName = varName;
            return this;
        }
        public String getVarName() {
            return this.varName;
        }

        public DescribeVarDiffBetweenGroupResponseBodyVariableDiffsVariableDiff setTest(DescribeVarDiffBetweenGroupResponseBodyVariableDiffsVariableDiffTest test) {
            this.test = test;
            return this;
        }
        public DescribeVarDiffBetweenGroupResponseBodyVariableDiffsVariableDiffTest getTest() {
            return this.test;
        }

        public DescribeVarDiffBetweenGroupResponseBodyVariableDiffsVariableDiff setPre(DescribeVarDiffBetweenGroupResponseBodyVariableDiffsVariableDiffPre pre) {
            this.pre = pre;
            return this;
        }
        public DescribeVarDiffBetweenGroupResponseBodyVariableDiffsVariableDiffPre getPre() {
            return this.pre;
        }

        public DescribeVarDiffBetweenGroupResponseBodyVariableDiffsVariableDiff setRelease(DescribeVarDiffBetweenGroupResponseBodyVariableDiffsVariableDiffRelease release) {
            this.release = release;
            return this;
        }
        public DescribeVarDiffBetweenGroupResponseBodyVariableDiffsVariableDiffRelease getRelease() {
            return this.release;
        }

    }

    public static class DescribeVarDiffBetweenGroupResponseBodyVariableDiffs extends TeaModel {
        @NameInMap("VariableDiff")
        public java.util.List<DescribeVarDiffBetweenGroupResponseBodyVariableDiffsVariableDiff> variableDiff;

        public static DescribeVarDiffBetweenGroupResponseBodyVariableDiffs build(java.util.Map<String, ?> map) throws Exception {
            DescribeVarDiffBetweenGroupResponseBodyVariableDiffs self = new DescribeVarDiffBetweenGroupResponseBodyVariableDiffs();
            return TeaModel.build(map, self);
        }

        public DescribeVarDiffBetweenGroupResponseBodyVariableDiffs setVariableDiff(java.util.List<DescribeVarDiffBetweenGroupResponseBodyVariableDiffsVariableDiff> variableDiff) {
            this.variableDiff = variableDiff;
            return this;
        }
        public java.util.List<DescribeVarDiffBetweenGroupResponseBodyVariableDiffsVariableDiff> getVariableDiff() {
            return this.variableDiff;
        }

    }

}
