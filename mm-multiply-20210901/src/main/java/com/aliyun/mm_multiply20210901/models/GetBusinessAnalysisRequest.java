// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mm_multiply20210901.models;

import com.aliyun.tea.*;

public class GetBusinessAnalysisRequest extends TeaModel {
    // 业务日期
    @NameInMap("BizDate")
    public String bizDate;

    @NameInMap("BizId")
    public String bizId;

    // 日期类型：日、周、月
    @NameInMap("DateType")
    public String dateType;

    @NameInMap("GroupTags")
    public String groupTags;

    @NameInMap("IndexTags")
    public String indexTags;

    @NameInMap("TypeCode")
    public Integer typeCode;

    @NameInMap("UserId")
    public Long userId;

    public static GetBusinessAnalysisRequest build(java.util.Map<String, ?> map) throws Exception {
        GetBusinessAnalysisRequest self = new GetBusinessAnalysisRequest();
        return TeaModel.build(map, self);
    }

    public GetBusinessAnalysisRequest setBizDate(String bizDate) {
        this.bizDate = bizDate;
        return this;
    }
    public String getBizDate() {
        return this.bizDate;
    }

    public GetBusinessAnalysisRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public GetBusinessAnalysisRequest setDateType(String dateType) {
        this.dateType = dateType;
        return this;
    }
    public String getDateType() {
        return this.dateType;
    }

    public GetBusinessAnalysisRequest setGroupTags(String groupTags) {
        this.groupTags = groupTags;
        return this;
    }
    public String getGroupTags() {
        return this.groupTags;
    }

    public GetBusinessAnalysisRequest setIndexTags(String indexTags) {
        this.indexTags = indexTags;
        return this;
    }
    public String getIndexTags() {
        return this.indexTags;
    }

    public GetBusinessAnalysisRequest setTypeCode(Integer typeCode) {
        this.typeCode = typeCode;
        return this;
    }
    public Integer getTypeCode() {
        return this.typeCode;
    }

    public GetBusinessAnalysisRequest setUserId(Long userId) {
        this.userId = userId;
        return this;
    }
    public Long getUserId() {
        return this.userId;
    }

}
