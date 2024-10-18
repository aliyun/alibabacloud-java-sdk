// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class DeleteRoutineCodeVersionRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1710120201067203242</p>
     */
    @NameInMap("CodeVersion")
    public String codeVersion;

    /**
     * <strong>example:</strong>
     * <p>test-routine1</p>
     */
    @NameInMap("Name")
    public String name;

    public static DeleteRoutineCodeVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteRoutineCodeVersionRequest self = new DeleteRoutineCodeVersionRequest();
        return TeaModel.build(map, self);
    }

    public DeleteRoutineCodeVersionRequest setCodeVersion(String codeVersion) {
        this.codeVersion = codeVersion;
        return this;
    }
    public String getCodeVersion() {
        return this.codeVersion;
    }

    public DeleteRoutineCodeVersionRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
