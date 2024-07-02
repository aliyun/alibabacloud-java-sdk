// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20231229.models;

import com.aliyun.tea.*;

public class AddFileRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cate_cdd11b1b79a74e8bbd675c356a91ee3510024405</p>
     */
    @NameInMap("CategoryId")
    public String categoryId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>68abd1dea7b6404d8f7d7b9f7fbd332d.1716698936847</p>
     */
    @NameInMap("LeaseId")
    public String leaseId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>DASHSCOPE_DOCMIND</p>
     */
    @NameInMap("Parser")
    public String parser;

    public static AddFileRequest build(java.util.Map<String, ?> map) throws Exception {
        AddFileRequest self = new AddFileRequest();
        return TeaModel.build(map, self);
    }

    public AddFileRequest setCategoryId(String categoryId) {
        this.categoryId = categoryId;
        return this;
    }
    public String getCategoryId() {
        return this.categoryId;
    }

    public AddFileRequest setLeaseId(String leaseId) {
        this.leaseId = leaseId;
        return this;
    }
    public String getLeaseId() {
        return this.leaseId;
    }

    public AddFileRequest setParser(String parser) {
        this.parser = parser;
        return this;
    }
    public String getParser() {
        return this.parser;
    }

}
