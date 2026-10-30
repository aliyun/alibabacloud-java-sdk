// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hcs_mgw20240626.models;

import com.aliyun.tea.*;

public class FilterRule extends TeaModel {
    /**
     * <p>The file type filters.</p>
     */
    @NameInMap("FileTypeFilters")
    public FileTypeFilters fileTypeFilters;

    /**
     * <p>The file name filters.</p>
     */
    @NameInMap("KeyFilters")
    public KeyFilters keyFilters;

    /**
     * <p>The file modification time filters.</p>
     */
    @NameInMap("LastModifiedFilters")
    public LastModifiedFilters lastModifiedFilters;

    /**
     * <p>The object prefix filter rules. Only Includes is supported. This filter applies only to full migration tasks.</p>
     */
    @NameInMap("PrefixFilters")
    public PrefixFilters prefixFilters;

    public static FilterRule build(java.util.Map<String, ?> map) throws Exception {
        FilterRule self = new FilterRule();
        return TeaModel.build(map, self);
    }

    public FilterRule setFileTypeFilters(FileTypeFilters fileTypeFilters) {
        this.fileTypeFilters = fileTypeFilters;
        return this;
    }
    public FileTypeFilters getFileTypeFilters() {
        return this.fileTypeFilters;
    }

    public FilterRule setKeyFilters(KeyFilters keyFilters) {
        this.keyFilters = keyFilters;
        return this;
    }
    public KeyFilters getKeyFilters() {
        return this.keyFilters;
    }

    public FilterRule setLastModifiedFilters(LastModifiedFilters lastModifiedFilters) {
        this.lastModifiedFilters = lastModifiedFilters;
        return this;
    }
    public LastModifiedFilters getLastModifiedFilters() {
        return this.lastModifiedFilters;
    }

    public FilterRule setPrefixFilters(PrefixFilters prefixFilters) {
        this.prefixFilters = prefixFilters;
        return this;
    }
    public PrefixFilters getPrefixFilters() {
        return this.prefixFilters;
    }

}
