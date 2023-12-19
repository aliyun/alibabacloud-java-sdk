// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class OtsTableRestoreDetail extends TeaModel {
    @NameInMap("BatchChannelCount")
    public Integer batchChannelCount;

    @NameInMap("IndexNameSuffix")
    public String indexNameSuffix;

    @NameInMap("OverwriteExisting")
    public Boolean overwriteExisting;

    @NameInMap("ReGenerateAutoIncrementPK")
    public Boolean reGenerateAutoIncrementPK;

    @NameInMap("RestoreIndex")
    public Boolean restoreIndex;

    @NameInMap("RestoreSearchIndex")
    public Boolean restoreSearchIndex;

    @NameInMap("SearchIndexNameSuffix")
    public String searchIndexNameSuffix;

    public static OtsTableRestoreDetail build(java.util.Map<String, ?> map) throws Exception {
        OtsTableRestoreDetail self = new OtsTableRestoreDetail();
        return TeaModel.build(map, self);
    }

    public OtsTableRestoreDetail setBatchChannelCount(Integer batchChannelCount) {
        this.batchChannelCount = batchChannelCount;
        return this;
    }
    public Integer getBatchChannelCount() {
        return this.batchChannelCount;
    }

    public OtsTableRestoreDetail setIndexNameSuffix(String indexNameSuffix) {
        this.indexNameSuffix = indexNameSuffix;
        return this;
    }
    public String getIndexNameSuffix() {
        return this.indexNameSuffix;
    }

    public OtsTableRestoreDetail setOverwriteExisting(Boolean overwriteExisting) {
        this.overwriteExisting = overwriteExisting;
        return this;
    }
    public Boolean getOverwriteExisting() {
        return this.overwriteExisting;
    }

    public OtsTableRestoreDetail setReGenerateAutoIncrementPK(Boolean reGenerateAutoIncrementPK) {
        this.reGenerateAutoIncrementPK = reGenerateAutoIncrementPK;
        return this;
    }
    public Boolean getReGenerateAutoIncrementPK() {
        return this.reGenerateAutoIncrementPK;
    }

    public OtsTableRestoreDetail setRestoreIndex(Boolean restoreIndex) {
        this.restoreIndex = restoreIndex;
        return this;
    }
    public Boolean getRestoreIndex() {
        return this.restoreIndex;
    }

    public OtsTableRestoreDetail setRestoreSearchIndex(Boolean restoreSearchIndex) {
        this.restoreSearchIndex = restoreSearchIndex;
        return this;
    }
    public Boolean getRestoreSearchIndex() {
        return this.restoreSearchIndex;
    }

    public OtsTableRestoreDetail setSearchIndexNameSuffix(String searchIndexNameSuffix) {
        this.searchIndexNameSuffix = searchIndexNameSuffix;
        return this;
    }
    public String getSearchIndexNameSuffix() {
        return this.searchIndexNameSuffix;
    }

}
