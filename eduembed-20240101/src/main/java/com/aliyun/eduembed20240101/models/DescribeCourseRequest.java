// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eduembed20240101.models;

import com.aliyun.tea.*;

public class DescribeCourseRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("CourseId")
    public Long courseId;

    public static DescribeCourseRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCourseRequest self = new DescribeCourseRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCourseRequest setCourseId(Long courseId) {
        this.courseId = courseId;
        return this;
    }
    public Long getCourseId() {
        return this.courseId;
    }

}
