// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hcs_mgw20240626.models;

import com.aliyun.tea.*;

public class FilterRule extends TeaModel {
    @NameInMap("FileTypeFilters")
    public FileTypeFilters fileTypeFilters;

    @NameInMap("KeyFilters")
    public KeyFilters keyFilters;

    @NameInMap("LastModifiedFilters")
    public LastModifiedFilters lastModifiedFilters;

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

}
