// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class RegisterLineageRelationRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("LineageRelationRegisterVO")
    public LineageRelationRegisterVO lineageRelationRegisterVO;

    public static RegisterLineageRelationRequest build(java.util.Map<String, ?> map) throws Exception {
        RegisterLineageRelationRequest self = new RegisterLineageRelationRequest();
        return TeaModel.build(map, self);
    }

    public RegisterLineageRelationRequest setLineageRelationRegisterVO(LineageRelationRegisterVO lineageRelationRegisterVO) {
        this.lineageRelationRegisterVO = lineageRelationRegisterVO;
        return this;
    }
    public LineageRelationRegisterVO getLineageRelationRegisterVO() {
        return this.lineageRelationRegisterVO;
    }

}
