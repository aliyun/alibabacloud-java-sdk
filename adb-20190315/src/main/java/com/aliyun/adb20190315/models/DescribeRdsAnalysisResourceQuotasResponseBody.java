// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class DescribeRdsAnalysisResourceQuotasResponseBody extends TeaModel {
    /**
     * <p>The editions of the MySQL analytic instances.</p>
     */
    @NameInMap("DBNodeCategoryList")
    public DescribeRdsAnalysisResourceQuotasResponseBodyDBNodeCategoryList DBNodeCategoryList;

    /**
     * <p>The instance types of the MySQL analytic instances.</p>
     */
    @NameInMap("DBNodeClassList")
    public DescribeRdsAnalysisResourceQuotasResponseBodyDBNodeClassList DBNodeClassList;

    /**
     * <p>The storage sizes of the MySQL analytic instances.</p>
     */
    @NameInMap("DBNodeStorageList")
    public DescribeRdsAnalysisResourceQuotasResponseBodyDBNodeStorageList DBNodeStorageList;

    /**
     * <p>The versions of the MySQL analytic instances.</p>
     */
    @NameInMap("EngineVersionList")
    public DescribeRdsAnalysisResourceQuotasResponseBodyEngineVersionList engineVersionList;

    /**
     * <p>The modes of the MySQL analytic instances.</p>
     */
    @NameInMap("ModeList")
    public DescribeRdsAnalysisResourceQuotasResponseBodyModeList modeList;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1A31D7FA-1826-5843-8807-D2F715E70CB0</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The storage types of the MySQL analytic instances.</p>
     */
    @NameInMap("StorageTypeList")
    public DescribeRdsAnalysisResourceQuotasResponseBodyStorageTypeList storageTypeList;

    public static DescribeRdsAnalysisResourceQuotasResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRdsAnalysisResourceQuotasResponseBody self = new DescribeRdsAnalysisResourceQuotasResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRdsAnalysisResourceQuotasResponseBody setDBNodeCategoryList(DescribeRdsAnalysisResourceQuotasResponseBodyDBNodeCategoryList DBNodeCategoryList) {
        this.DBNodeCategoryList = DBNodeCategoryList;
        return this;
    }
    public DescribeRdsAnalysisResourceQuotasResponseBodyDBNodeCategoryList getDBNodeCategoryList() {
        return this.DBNodeCategoryList;
    }

    public DescribeRdsAnalysisResourceQuotasResponseBody setDBNodeClassList(DescribeRdsAnalysisResourceQuotasResponseBodyDBNodeClassList DBNodeClassList) {
        this.DBNodeClassList = DBNodeClassList;
        return this;
    }
    public DescribeRdsAnalysisResourceQuotasResponseBodyDBNodeClassList getDBNodeClassList() {
        return this.DBNodeClassList;
    }

    public DescribeRdsAnalysisResourceQuotasResponseBody setDBNodeStorageList(DescribeRdsAnalysisResourceQuotasResponseBodyDBNodeStorageList DBNodeStorageList) {
        this.DBNodeStorageList = DBNodeStorageList;
        return this;
    }
    public DescribeRdsAnalysisResourceQuotasResponseBodyDBNodeStorageList getDBNodeStorageList() {
        return this.DBNodeStorageList;
    }

    public DescribeRdsAnalysisResourceQuotasResponseBody setEngineVersionList(DescribeRdsAnalysisResourceQuotasResponseBodyEngineVersionList engineVersionList) {
        this.engineVersionList = engineVersionList;
        return this;
    }
    public DescribeRdsAnalysisResourceQuotasResponseBodyEngineVersionList getEngineVersionList() {
        return this.engineVersionList;
    }

    public DescribeRdsAnalysisResourceQuotasResponseBody setModeList(DescribeRdsAnalysisResourceQuotasResponseBodyModeList modeList) {
        this.modeList = modeList;
        return this;
    }
    public DescribeRdsAnalysisResourceQuotasResponseBodyModeList getModeList() {
        return this.modeList;
    }

    public DescribeRdsAnalysisResourceQuotasResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeRdsAnalysisResourceQuotasResponseBody setStorageTypeList(DescribeRdsAnalysisResourceQuotasResponseBodyStorageTypeList storageTypeList) {
        this.storageTypeList = storageTypeList;
        return this;
    }
    public DescribeRdsAnalysisResourceQuotasResponseBodyStorageTypeList getStorageTypeList() {
        return this.storageTypeList;
    }

    public static class DescribeRdsAnalysisResourceQuotasResponseBodyDBNodeCategoryListDBNodeCategory extends TeaModel {
        /**
         * <p>The display value.</p>
         * 
         * <strong>example:</strong>
         * <p>mixed_storage</p>
         */
        @NameInMap("Text")
        public String text;

        /**
         * <p>The real value.</p>
         * 
         * <strong>example:</strong>
         * <p>mixed_storage</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeRdsAnalysisResourceQuotasResponseBodyDBNodeCategoryListDBNodeCategory build(java.util.Map<String, ?> map) throws Exception {
            DescribeRdsAnalysisResourceQuotasResponseBodyDBNodeCategoryListDBNodeCategory self = new DescribeRdsAnalysisResourceQuotasResponseBodyDBNodeCategoryListDBNodeCategory();
            return TeaModel.build(map, self);
        }

        public DescribeRdsAnalysisResourceQuotasResponseBodyDBNodeCategoryListDBNodeCategory setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

        public DescribeRdsAnalysisResourceQuotasResponseBodyDBNodeCategoryListDBNodeCategory setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeRdsAnalysisResourceQuotasResponseBodyDBNodeCategoryList extends TeaModel {
        @NameInMap("DBNodeCategory")
        public java.util.List<DescribeRdsAnalysisResourceQuotasResponseBodyDBNodeCategoryListDBNodeCategory> DBNodeCategory;

        public static DescribeRdsAnalysisResourceQuotasResponseBodyDBNodeCategoryList build(java.util.Map<String, ?> map) throws Exception {
            DescribeRdsAnalysisResourceQuotasResponseBodyDBNodeCategoryList self = new DescribeRdsAnalysisResourceQuotasResponseBodyDBNodeCategoryList();
            return TeaModel.build(map, self);
        }

        public DescribeRdsAnalysisResourceQuotasResponseBodyDBNodeCategoryList setDBNodeCategory(java.util.List<DescribeRdsAnalysisResourceQuotasResponseBodyDBNodeCategoryListDBNodeCategory> DBNodeCategory) {
            this.DBNodeCategory = DBNodeCategory;
            return this;
        }
        public java.util.List<DescribeRdsAnalysisResourceQuotasResponseBodyDBNodeCategoryListDBNodeCategory> getDBNodeCategory() {
            return this.DBNodeCategory;
        }

    }

    public static class DescribeRdsAnalysisResourceQuotasResponseBodyDBNodeClassListDBNodeClass extends TeaModel {
        /**
         * <p>The display value.</p>
         * 
         * <strong>example:</strong>
         * <p>E32</p>
         */
        @NameInMap("Text")
        public String text;

        /**
         * <p>The real value.</p>
         * 
         * <strong>example:</strong>
         * <p>E32</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeRdsAnalysisResourceQuotasResponseBodyDBNodeClassListDBNodeClass build(java.util.Map<String, ?> map) throws Exception {
            DescribeRdsAnalysisResourceQuotasResponseBodyDBNodeClassListDBNodeClass self = new DescribeRdsAnalysisResourceQuotasResponseBodyDBNodeClassListDBNodeClass();
            return TeaModel.build(map, self);
        }

        public DescribeRdsAnalysisResourceQuotasResponseBodyDBNodeClassListDBNodeClass setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

        public DescribeRdsAnalysisResourceQuotasResponseBodyDBNodeClassListDBNodeClass setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeRdsAnalysisResourceQuotasResponseBodyDBNodeClassList extends TeaModel {
        @NameInMap("DBNodeClass")
        public java.util.List<DescribeRdsAnalysisResourceQuotasResponseBodyDBNodeClassListDBNodeClass> DBNodeClass;

        public static DescribeRdsAnalysisResourceQuotasResponseBodyDBNodeClassList build(java.util.Map<String, ?> map) throws Exception {
            DescribeRdsAnalysisResourceQuotasResponseBodyDBNodeClassList self = new DescribeRdsAnalysisResourceQuotasResponseBodyDBNodeClassList();
            return TeaModel.build(map, self);
        }

        public DescribeRdsAnalysisResourceQuotasResponseBodyDBNodeClassList setDBNodeClass(java.util.List<DescribeRdsAnalysisResourceQuotasResponseBodyDBNodeClassListDBNodeClass> DBNodeClass) {
            this.DBNodeClass = DBNodeClass;
            return this;
        }
        public java.util.List<DescribeRdsAnalysisResourceQuotasResponseBodyDBNodeClassListDBNodeClass> getDBNodeClass() {
            return this.DBNodeClass;
        }

    }

    public static class DescribeRdsAnalysisResourceQuotasResponseBodyDBNodeStorageListDBNodeStorage extends TeaModel {
        /**
         * <p>The display value.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Text")
        public String text;

        /**
         * <p>The real value.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeRdsAnalysisResourceQuotasResponseBodyDBNodeStorageListDBNodeStorage build(java.util.Map<String, ?> map) throws Exception {
            DescribeRdsAnalysisResourceQuotasResponseBodyDBNodeStorageListDBNodeStorage self = new DescribeRdsAnalysisResourceQuotasResponseBodyDBNodeStorageListDBNodeStorage();
            return TeaModel.build(map, self);
        }

        public DescribeRdsAnalysisResourceQuotasResponseBodyDBNodeStorageListDBNodeStorage setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

        public DescribeRdsAnalysisResourceQuotasResponseBodyDBNodeStorageListDBNodeStorage setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeRdsAnalysisResourceQuotasResponseBodyDBNodeStorageList extends TeaModel {
        @NameInMap("DBNodeStorage")
        public java.util.List<DescribeRdsAnalysisResourceQuotasResponseBodyDBNodeStorageListDBNodeStorage> DBNodeStorage;

        public static DescribeRdsAnalysisResourceQuotasResponseBodyDBNodeStorageList build(java.util.Map<String, ?> map) throws Exception {
            DescribeRdsAnalysisResourceQuotasResponseBodyDBNodeStorageList self = new DescribeRdsAnalysisResourceQuotasResponseBodyDBNodeStorageList();
            return TeaModel.build(map, self);
        }

        public DescribeRdsAnalysisResourceQuotasResponseBodyDBNodeStorageList setDBNodeStorage(java.util.List<DescribeRdsAnalysisResourceQuotasResponseBodyDBNodeStorageListDBNodeStorage> DBNodeStorage) {
            this.DBNodeStorage = DBNodeStorage;
            return this;
        }
        public java.util.List<DescribeRdsAnalysisResourceQuotasResponseBodyDBNodeStorageListDBNodeStorage> getDBNodeStorage() {
            return this.DBNodeStorage;
        }

    }

    public static class DescribeRdsAnalysisResourceQuotasResponseBodyEngineVersionListEngineVersion extends TeaModel {
        /**
         * <p>The display value.</p>
         * 
         * <strong>example:</strong>
         * <p>3.0</p>
         */
        @NameInMap("Text")
        public String text;

        /**
         * <p>The real value.</p>
         * 
         * <strong>example:</strong>
         * <p>3.0</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeRdsAnalysisResourceQuotasResponseBodyEngineVersionListEngineVersion build(java.util.Map<String, ?> map) throws Exception {
            DescribeRdsAnalysisResourceQuotasResponseBodyEngineVersionListEngineVersion self = new DescribeRdsAnalysisResourceQuotasResponseBodyEngineVersionListEngineVersion();
            return TeaModel.build(map, self);
        }

        public DescribeRdsAnalysisResourceQuotasResponseBodyEngineVersionListEngineVersion setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

        public DescribeRdsAnalysisResourceQuotasResponseBodyEngineVersionListEngineVersion setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeRdsAnalysisResourceQuotasResponseBodyEngineVersionList extends TeaModel {
        @NameInMap("EngineVersion")
        public java.util.List<DescribeRdsAnalysisResourceQuotasResponseBodyEngineVersionListEngineVersion> engineVersion;

        public static DescribeRdsAnalysisResourceQuotasResponseBodyEngineVersionList build(java.util.Map<String, ?> map) throws Exception {
            DescribeRdsAnalysisResourceQuotasResponseBodyEngineVersionList self = new DescribeRdsAnalysisResourceQuotasResponseBodyEngineVersionList();
            return TeaModel.build(map, self);
        }

        public DescribeRdsAnalysisResourceQuotasResponseBodyEngineVersionList setEngineVersion(java.util.List<DescribeRdsAnalysisResourceQuotasResponseBodyEngineVersionListEngineVersion> engineVersion) {
            this.engineVersion = engineVersion;
            return this;
        }
        public java.util.List<DescribeRdsAnalysisResourceQuotasResponseBodyEngineVersionListEngineVersion> getEngineVersion() {
            return this.engineVersion;
        }

    }

    public static class DescribeRdsAnalysisResourceQuotasResponseBodyModeListMode extends TeaModel {
        /**
         * <p>The display value.</p>
         * 
         * <strong>example:</strong>
         * <p>flexible</p>
         */
        @NameInMap("Text")
        public String text;

        /**
         * <p>The real value.</p>
         * 
         * <strong>example:</strong>
         * <p>flexible</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeRdsAnalysisResourceQuotasResponseBodyModeListMode build(java.util.Map<String, ?> map) throws Exception {
            DescribeRdsAnalysisResourceQuotasResponseBodyModeListMode self = new DescribeRdsAnalysisResourceQuotasResponseBodyModeListMode();
            return TeaModel.build(map, self);
        }

        public DescribeRdsAnalysisResourceQuotasResponseBodyModeListMode setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

        public DescribeRdsAnalysisResourceQuotasResponseBodyModeListMode setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeRdsAnalysisResourceQuotasResponseBodyModeList extends TeaModel {
        @NameInMap("Mode")
        public java.util.List<DescribeRdsAnalysisResourceQuotasResponseBodyModeListMode> mode;

        public static DescribeRdsAnalysisResourceQuotasResponseBodyModeList build(java.util.Map<String, ?> map) throws Exception {
            DescribeRdsAnalysisResourceQuotasResponseBodyModeList self = new DescribeRdsAnalysisResourceQuotasResponseBodyModeList();
            return TeaModel.build(map, self);
        }

        public DescribeRdsAnalysisResourceQuotasResponseBodyModeList setMode(java.util.List<DescribeRdsAnalysisResourceQuotasResponseBodyModeListMode> mode) {
            this.mode = mode;
            return this;
        }
        public java.util.List<DescribeRdsAnalysisResourceQuotasResponseBodyModeListMode> getMode() {
            return this.mode;
        }

    }

    public static class DescribeRdsAnalysisResourceQuotasResponseBodyStorageTypeListStorageType extends TeaModel {
        /**
         * <p>The display value.</p>
         * 
         * <strong>example:</strong>
         * <p>cloud_essd</p>
         */
        @NameInMap("Text")
        public String text;

        /**
         * <p>The real value.</p>
         * 
         * <strong>example:</strong>
         * <p>cloud_essd</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeRdsAnalysisResourceQuotasResponseBodyStorageTypeListStorageType build(java.util.Map<String, ?> map) throws Exception {
            DescribeRdsAnalysisResourceQuotasResponseBodyStorageTypeListStorageType self = new DescribeRdsAnalysisResourceQuotasResponseBodyStorageTypeListStorageType();
            return TeaModel.build(map, self);
        }

        public DescribeRdsAnalysisResourceQuotasResponseBodyStorageTypeListStorageType setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

        public DescribeRdsAnalysisResourceQuotasResponseBodyStorageTypeListStorageType setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeRdsAnalysisResourceQuotasResponseBodyStorageTypeList extends TeaModel {
        @NameInMap("StorageType")
        public java.util.List<DescribeRdsAnalysisResourceQuotasResponseBodyStorageTypeListStorageType> storageType;

        public static DescribeRdsAnalysisResourceQuotasResponseBodyStorageTypeList build(java.util.Map<String, ?> map) throws Exception {
            DescribeRdsAnalysisResourceQuotasResponseBodyStorageTypeList self = new DescribeRdsAnalysisResourceQuotasResponseBodyStorageTypeList();
            return TeaModel.build(map, self);
        }

        public DescribeRdsAnalysisResourceQuotasResponseBodyStorageTypeList setStorageType(java.util.List<DescribeRdsAnalysisResourceQuotasResponseBodyStorageTypeListStorageType> storageType) {
            this.storageType = storageType;
            return this;
        }
        public java.util.List<DescribeRdsAnalysisResourceQuotasResponseBodyStorageTypeListStorageType> getStorageType() {
            return this.storageType;
        }

    }

}
